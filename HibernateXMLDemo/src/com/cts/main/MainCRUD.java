package com.cts.main;

import java.math.BigInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.cts.bean.employee;

public class MainCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		employee emp = new employee();
		emp.setEmp_id(39);
		emp.setEmp_name("Rahul");
		emp.setEmail("rahul@gmail.com");
		emp.setMobile(BigInteger.valueOf(913984549));

		session.save(emp);
		t.commit();
		System.out.println("1 record inserted successfully");
		factory.close();
		session.close();
	}
}
