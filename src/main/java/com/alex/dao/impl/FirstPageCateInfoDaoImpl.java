package com.alex.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.alex.dao.AllCateInfoDao;
import com.alex.dao.BaseDao;
import com.alex.dao.FirstPageCateInfoDao;
import com.alex.dao.UserDao;
import com.alex.entity.Allcateinfo;
import com.alex.entity.Firstpagecateinfo;
import com.alex.entity.User;

@Repository
public class FirstPageCateInfoDaoImpl implements FirstPageCateInfoDao {
	@Resource
    private BaseDao baseDao;

	public List<Firstpagecateinfo> getAllFPageCateInfo() {
		String hsql="from first_page_cate_info";
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
	}

	public Firstpagecateinfo getFPageCateInfoByID(int ID){
		String hsql="from first_page_cate_info where id = "+ ID;
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        return (Firstpagecateinfo)query.uniqueResult();
	}
	
	public void updateFPageCateInfo(Firstpagecateinfo fPageCate) {
		// TODO Auto-generated method stub
		String hsql="update first_page_cate_info set editable =?, name = ? where ID = ?";
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createSQLQuery(hsql);
        query.setString(0, fPageCate.getEditable());
        query.setString(1, fPageCate.getName());
        query.setInteger(2, fPageCate.getId());
        query.executeUpdate();
		
	}
	public void insertFPageCateInfo(Firstpagecateinfo fPageCate) {
		String hsql="insert into first_page_cate_info (id, name, editable) values (?,?,?)";
	    Session session = baseDao.getSessionFactory().getCurrentSession();
	    Query query = session.createSQLQuery(hsql);
	    query.setInteger(0,fPageCate.getId());
	    query.setString(1, fPageCate.getName());
	    query.setString(2, fPageCate.getEditable());
	    query.executeUpdate();
	}
	
	public void removeFPageCateInfo(Firstpagecateinfo fPageCate) {
		String hsql="delete from first_page_cate_info where ID = ?";
	    Session session = baseDao.getSessionFactory().getCurrentSession();
	    Query query = session.createSQLQuery(hsql);
	    query.setInteger(0,fPageCate.getId());
	    query.executeUpdate();
	}


}
