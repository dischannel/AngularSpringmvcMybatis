package com.alex.dao.impl;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.alex.dao.BaseDao;

@Repository
public class BaseDaoImpl implements BaseDao {
	@Resource
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
