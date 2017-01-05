package com.alex.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.alex.dao.AllCateInfoDao;
import com.alex.dao.BaseDao;
import com.alex.dao.UserDao;
import com.alex.entity.Allcateinfo;
import com.alex.entity.User;

@Repository
public class AllCateInfoDaoImpl implements AllCateInfoDao {
	@Resource
    private BaseDao baseDao;
	
	public List<Allcateinfo> getAllCateInfo(){
        String hsql="from all_cate_info";
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
    }

}
