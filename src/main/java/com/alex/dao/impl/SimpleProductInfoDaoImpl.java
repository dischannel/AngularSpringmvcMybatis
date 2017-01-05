package com.alex.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.alex.dao.BaseDao;
import com.alex.dao.SimpleProductInfoDao;
import com.alex.entity.Simpleproductinfo;

@Repository
public class SimpleProductInfoDaoImpl implements SimpleProductInfoDao {
	@Resource
    private BaseDao baseDao;

	public List<Simpleproductinfo> getAllSimpleProduct() {
		String hsql="from simple_product_info";
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
	}

	public Simpleproductinfo getSProductInfoByID(int ID) {
		String hsql="from simple_product_info where id = "+ ID;
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        return (Simpleproductinfo)query.uniqueResult();
	}

	public void insertSProductInfo(Simpleproductinfo sProductInfo) {
		String hsql="insert into simple_product_info (cover_image_url, description, image_urls, name, price, purchase_url, url, id, is_favorite) values (?,?,?,?,?,?,?,?,?)";
	    Session session = baseDao.getSessionFactory().getCurrentSession();
	    Query query = session.createSQLQuery(hsql);
	    query.setString(0, sProductInfo.getCoverImageUrl());
        query.setString(1, sProductInfo.getDescription());
        query.setString(2, sProductInfo.getImageUrls());
        query.setString(3, sProductInfo.getName());
        query.setString(4, sProductInfo.getPrice());
        query.setString(5, sProductInfo.getPurchaseUrl());
        query.setString(6, sProductInfo.getUrl());
        query.setInteger(7, sProductInfo.getId());
        query.setString(8, "False");
	    query.executeUpdate();
		
	}

	public void updateSProductInfo(Simpleproductinfo sProductInfo) {
		String hsql="update simple_product_info set cover_image_url = ?, description =?, image_urls = ?, name = ?,"
				+ " price = ?, purchase_url=?, url = ? where id = ?";
        Session session = baseDao.getSessionFactory().getCurrentSession();
        Query query = session.createSQLQuery(hsql);
        query.setString(0, sProductInfo.getCoverImageUrl());
        query.setString(1, sProductInfo.getDescription());
        query.setString(2, sProductInfo.getImageUrls());
        query.setString(3, sProductInfo.getName());
        query.setString(4, sProductInfo.getPrice());
        query.setString(5, sProductInfo.getPurchaseUrl());
        query.setString(6, sProductInfo.getUrl());
        query.setInteger(7, sProductInfo.getId());
        query.executeUpdate();
		
	}

	public void removeSProductInfo(Simpleproductinfo fPageCate) {
		String hsql="delete from simple_product_info where ID = ?";
	    Session session = baseDao.getSessionFactory().getCurrentSession();
	    Query query = session.createSQLQuery(hsql);
	    query.setInteger(0,fPageCate.getId());
	    query.executeUpdate();
	}


}
