package com.shahin.sessionHelper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHelper {
	
	private Configuration configuration=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	public SessionHelper(){
		configuration=new Configuration();
		sessionFactory=configuration.configure().buildSessionFactory();
		
	}
	
	public Session getSession(){
		
		session=sessionFactory.openSession();
		return session;
		
	}
	
}
