package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.ruthu.Demohib.Alien;

public class AppTest 
{
    public static void main( String[] args )
    {
        Alien hibernate = new Alien();
        hibernate.setAid(101);
        hibernate.setAname("ruthu");
        hibernate.setColor("Green");
        
        Configuration con = new Configuration();
        con.configure("com/hibernate/resources/hibernate.cfg.xml");
        con.addAnnotatedClass(Alien.class);
        SessionFactory sf= con.buildSessionFactory();
       
        Session session= sf.openSession(); 
        Transaction tx = session.beginTransaction();
        session.save(hibernate);
        tx.commit();
        sf.close();
        session.close();
        
    }
}

