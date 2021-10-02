package com.ruthu.caching;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Cache {
	public static void main(String[]args)
	{
		Alien a = null;
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		a=(Alien)session1.get(Alien.class,101);
		System.out.println(a);
		
		session1.getTransaction().commit();
		session1.close();
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		
	
		a=(Alien)session2.get(Alien.class,102);
		System.out.println(a);	
		
		session2.getTransaction().commit();
		session2.close();
		
	}

}
