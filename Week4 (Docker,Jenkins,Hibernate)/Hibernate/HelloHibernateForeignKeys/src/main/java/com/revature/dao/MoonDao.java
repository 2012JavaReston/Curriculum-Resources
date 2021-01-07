package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Moon;
import com.revature.util.HibernateUtil;

public class MoonDao {
	
	public void insert(Moon m) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(m);
		
		tx.commit();
//		ses.close();
	}

}
