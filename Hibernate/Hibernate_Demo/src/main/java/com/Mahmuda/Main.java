package com.Mahmuda;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(com.Mahmuda.Alien.class);
        SessionFactory fac=cfg.buildSessionFactory();
        Session session=fac.openSession();
        

         //  create the data in database
         Alien a1 = new Alien();
         a1.setAid(103);
         a1.setAname("Navin");
         a1.setTech("C++");

         //Transaction needed while saving ,updating, deleting
         Transaction transaction=session.beginTransaction();
         session.persist(a1);
         transaction.commit();

        /*
        // this is for get or fetch the data
        Alien a1=session.get(Alien.class, 102);
        System.out.println(a1);


        //This is for update the data
        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Begum");
        a1.setTech("C++");
        Transaction tx=session.beginTransaction();
        session.merge(a1); //If data is available then merge will update.if it's not then merge wil create the data
        tx.commit();

        //This is for delete the data
        Transaction tx=session.beginTransaction();
        Alien a1=session.get(Alien.class, 104);
        session.remove(a1);
        tx.commit();

        */
        session.close();
        fac.close();

    }
}