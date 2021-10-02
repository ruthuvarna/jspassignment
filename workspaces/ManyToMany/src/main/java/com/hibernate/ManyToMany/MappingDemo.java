package com.hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo 
{
    public static void main(String[]args) {
    	Configuration cfg=new Configuration();
    	cfg.configure("com/hibernate/resources/hibernate.cfg.xml");
    	cfg.addAnnotatedClass(Emp.class).addAnnotatedClass(Project.class);
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session = factory.openSession();
        org.hibernate.Transaction txt = session.beginTransaction();
    	Emp e1=new Emp();
    	Emp e2=new Emp();
    	
    	e1.setEid(34);
    	e1.setName("Ram");
    	
    	e2.setEid(35);
    	e2.setName("Shyam");
    	
    	Project p1=new Project();
    	Project p2=new Project();
    	
    	p1.setPid(121);
    	p1.setProjectName("library management system");
    	
    	p1.setPid(131);
    	p1.setProjectName("chatbot");
    	
    	List<Emp>list1=new ArrayList<Emp>();
    	List<Project>list2=new ArrayList<Project>();
    	
    	list1.add(e1);
    	list1.add(e2);
    	
    	list2.add(p1);
    	list2.add(p2);
    	
    	e1.setProject(list2);
    	p2.setEmps(list1);
    	
    	session.save(e1);
    	session.save(e2);
    	session.save(p1);
    	session.save(p2);
    	
    	txt.commit();
    	session.close();
    	factory.close();
    }
}
