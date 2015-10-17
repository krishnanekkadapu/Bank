package com.bank.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bank.model.CustomerObject;
import com.bank.model.LoginObject;

public class DatabaseSession {
	/*static SessionFactory factory;
	static
	{
		factory = new Configuration().configure().buildSessionFactory(); 
	}
*/
	
	public List<LoginObject> getDetails()
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("from LoginObject");
		List<LoginObject> login = query.list();
		return  login;
	}
	
	public void saveDetails(CustomerObject customer)
	{
		SessionFactory factory = new Configuration().configure("save.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
	}
}
