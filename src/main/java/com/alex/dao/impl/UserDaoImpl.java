package com.alex.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.alex.dao.UserDao;
import com.alex.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Resource
    protected SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<User> getAllUsers(){
        String hsql="from user";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
    }

}
