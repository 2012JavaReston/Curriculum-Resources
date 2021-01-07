package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Feature;
import com.revature.util.HibernateUtil;

public class FeatureDao {
	
	public void insert(Feature f) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(f);
		
		tx.commit();
//		ses.close();
	}

}
