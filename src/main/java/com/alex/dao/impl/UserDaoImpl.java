package com.alex.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.alex.dao.BaseDao;
import com.alex.dao.UserDao;
import com.alex.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Resource
    private BaseDao baseDao;
	public List<User> getAllUsers(){
        String hsql="from user";
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
    }
}
