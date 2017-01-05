package alex.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  on 2016/5/27.
 */
public class GenEntity {
    private String packageOutPath = "com.alex.entity";//指定实体生成所在包的路径
    private String authorName = "Alex";//作者名字
    private String tableName = "all_cate_info";//表名
    private String[] colNames; // 列名数组
    private String[] orgColNames; //原始列名数组
    private String[] colTypes; //列名类型数组
    private int[] colSizes; //列名大小数组
    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*
    private boolean f_decimal = false;//是否需要导入java.math.BigDecimal

    //数据库连接
    private static final String URL ="jdbc:mysql://localhost:3306/db_news";
    private static final String NAME = "root";
    private static final String PASS = "root";
    private static final String DRIVER ="com.mysql.jdbc.Driver";

    /*
	 * 构造函数
	 */
    public GenEntity(){

    }

    public void genTableToCode(){
        //创建连接
        Connection con = null;
        //查要生成实体类的表
        String sql = "select * from " + tableName;
        PreparedStatement pStemt = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,NAME,PASS);
            pStemt = con.prepareStatement(sql);
            ResultSetMetaData rsmd = pStemt.getMetaData();
            int size = rsmd.getColumnCount();	//统计列
            colNames = new String[size];
            orgColNames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            for (int i = 0; i < size; i++) {
                String columnName = rsmd.getColumnName(i+1);
                orgColNames[i] = columnName;
                if(!"CREATED_BY".equals(columnName) && !"CREATION_DATE".equals(columnName)
                        && !"LAST_UPDATED_BY".equals(columnName) && !"LAST_UPDATE_DATE".equals(columnName)){
                    String [] columnNameStr =columnName.toLowerCase().split("_");
                    columnName = "";
                    for(String column : columnNameStr){
                        if(columnName.length() == 0){
                            columnName += column;
                        }else {
                            columnName += initCap(column);
                        }
                    }
                    colNames[i] = columnName;
                    colTypes[i] = rsmd.getColumnTypeName(i + 1);

                    if(colTypes[i].equalsIgnoreCase("datetime")){
                        f_util = true;
                    }
                    if(colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")){
                        f_sql = true;
                    }
                    if(colTypes[i].equalsIgnoreCase("decimal")){
                        f_decimal = true;
                    }
                    colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
                }
            }

            String content = parse(colNames,colTypes,colSizes);
            File directory = new File("");
            //System.out.println("绝对路径："+directory.getAbsolutePath());
            //System.out.println("相对路径："+directory.getCanonicalPath());
            String path=this.getClass().getResource("").getPath();

//            System.out.println(path);
//            System.out.println("src/?/"+path.substring(path.lastIndexOf("/com/", path.length())) );
//			  String outputPath = directory.getAbsolutePath()+ "/src/"+path.substring(path.lastIndexOf("/com/", path.length()), path.length()) + initCap(tablename) + ".java";
//            System.out.println( "\\src\\\\main\\java\\"+this.packageOutPath.replace(".", "\\")+"\\"+initCap(tableName) + ".java");
            String outputPath = directory.getAbsolutePath()+ "\\src\\\\main\\java\\"+this.packageOutPath.replace(".", "\\")+"\\"+initCap(tableName) + ".java";
//            System.out.println(directory.getAbsolutePath());
            File file = new File(outputPath);
            if(!file.exists()){
                file = new File(directory.getAbsolutePath()+ "\\src\\\\main\\java\\"+this.packageOutPath.replace(".", "\\"),initCap(tableName) + ".java");
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(outputPath);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(content);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 传参的方式生成表对应的实体类
     * @param tableName
     */
    public void genTableToCode(String tableName){
        this.tableName = tableName;
        genTableToCode();
    }

    /**
     * 功能：生成实体类主体代码
     * @param colNames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private String parse(String[] colNames, String[] colTypes, int[] colSizes) {
        StringBuffer sb = new StringBuffer();

        sb.append("package " + this.packageOutPath + ";\r\n");
        sb.append("\r\n");

        //判断是否导入工具包
        if(f_util){
            sb.append("import java.util.Date;\r\n");
        }
        if(f_sql){
            sb.append("import java.sql.*;\r\n");
        }
        if(f_decimal){
            sb.append("import java.math.BigDecimal;\r\n");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        sb.append("\r\n");
        //注释部分
        sb.append("/**\r\n");
        sb.append("* Created by "+this.authorName+" on "+df.format(new java.util.Date())+"\r\n");
        sb.append("*@Description "+tableName+" Entity\r\n");
        sb.append("*/ \r\n");
        sb.append("import javax.persistence.*;");
        sb.append("\r\n");
        sb.append("@Table(name=" + '"' + tableName  +'"'+")");
        sb.append("\r\n");
        sb.append("@Entity(name="+ '"'+ tableName +'"'+ ")");
        sb.append("\r\n");
        //实体部分
        sb.append("\r\n\r\npublic class " + initCap(tableName)+ "" + "{\r\n");
        processAllAttrs(sb);//属性
        processAllMethod(sb);//get set方法
        sb.append("}\r\n");

        //System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * 功能：生成所有属性
     * @param sb
     */
    private void processAllAttrs(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
        	sb.append("@Column(name=" +'"'+ orgColNames[i] + '"'+ ",length=100)\r\n");
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + colNames[i] + ";\r\n");
        }

    }

    /**
     * 功能：生成所有方法
     * @param sb
     */
    private void processAllMethod(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
            sb.append("\tpublic void set" + initCap(colNames[i]) + "(" + sqlType2JavaType(colTypes[i]) + " " +
                    colNames[i] + "){\r\n");
            sb.append("\tthis." + colNames[i] + "=" + colNames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initCap(colNames[i]) + "(){\r\n");
            sb.append("\t\treturn " + colNames[i] + ";\r\n");
            sb.append("\t}\r\n");
        }

    }

    /**
     * 功能：将输入字符串的首字母改成大写
     * @param str
     * @return
     */
    private String initCap(String str) {
        char[] ch = str.toCharArray();
        if(ch[0] >= 'a' && ch[0] <= 'z'){
            ch[0] = (char)(ch[0] - 32);
        }
        return new String(ch).replace("_", "");
    }

    /**
     * 功能：获得列的数据类型
     * @param sqlType
     * @return
     */
    private String sqlType2JavaType(String sqlType) {
        if(sqlType.equalsIgnoreCase("bit")){
            return "boolean";
        }else if(sqlType.equalsIgnoreCase("tinyint")){
            return "byte";
        }else if(sqlType.equalsIgnoreCase("s-mallint")){
            return "short";
        }else if(sqlType.equalsIgnoreCase("int")){
            return "Integer";
        }else if(sqlType.equalsIgnoreCase("bigint")){
            return "long";
        }else if(sqlType.equalsIgnoreCase("float")){
            return "float";
        }else if(sqlType.equalsIgnoreCase("numeric")
                || sqlType.equalsIgnoreCase("real") || sqlType.equalsIgnoreCase("money")
                || sqlType.equalsIgnoreCase("s-mallmoney")){
            return "double";
        }else if(sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")
                || sqlType.equalsIgnoreCase("text") || sqlType.equalsIgnoreCase("json")){
            return "String";
        }else if(sqlType.equalsIgnoreCase("datetime")){
            return "Date";
        }else if(sqlType.equalsIgnoreCase("image")){
            return "Blod";
        }else if(sqlType.equalsIgnoreCase("decimal")){
            return "BigDecimal";
        }

        return null;
    }


    public static void main(String[] args) {
    	GenEntity genTableToCode =  new GenEntity();
        List<String> tableNames = new ArrayList<String>();
//        tableNames.add("all_cate_info");
        tableNames.add("cate_page_info");
        tableNames.add("favo_lists_info");
        tableNames.add("first_page_ads_info");
        tableNames.add("first_page_cate_info");
        tableNames.add("list_page_info");
        tableNames.add("main_menu_info");
        tableNames.add("simple_product_info");
        for(String tableName : tableNames){
            genTableToCode.genTableToCode(tableName);
        }
    }

}