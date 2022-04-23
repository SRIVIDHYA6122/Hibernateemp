package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		Employee sob=new Employee ();
		sob.setEid(1);
		sob.setEname("Pnam");
		sob.setEsalary(200);
		
        Configuration conn=new Configuration().configure().addAnnotatedClass(Employee.class);	
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sf=conn.buildSessionFactory(reg);
        Session sess=sf.openSession();
       Transaction tx=sess.beginTransaction();
        
        sess.save(sob);
        tx.commit();
        		
	}

}
