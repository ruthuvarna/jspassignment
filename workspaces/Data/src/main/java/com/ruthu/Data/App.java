package com.ruthu.Data;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main (String...args){

        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Student info = new Student( "id", "name","rollnumber","gender","class_");
        HibernateConnector= new HibernateConnector();

        session.save(person);
        tx.commit();

        List<HibernateConnector> activities = (List<HibernateConnector>)session.createQuery("from HibernateConnector").list();
        System.out.println(Arrays.toString(activities.toArray()));

        session.close();
        HibernateUtil.shutdown();
    }
}