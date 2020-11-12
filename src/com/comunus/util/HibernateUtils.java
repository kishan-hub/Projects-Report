package com.comunus.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	
	private HibernateUtils()
	{
	}
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory ==null) {
		 Configuration config=new Configuration();
		 sessionFactory=config.configure("com/comunus/projectReport/config/hibernate.cfg.xml").buildSessionFactory();
		  System.out.println("eastablised the connection from Mysql db");
		}
		  return sessionFactory;
	}

}
