package com.sv.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Utility {
private static SessionFactory factory=null;
static {
	Configuration cfg=null;
	try {
	cfg=new Configuration();
	cfg.configure("com/sv/cfg/hibernate.cfg.xml");
	if(cfg!=null) {
		factory=cfg.buildSessionFactory();
	}
	}catch(Exception e){
		e.printStackTrace();
	}
}
public static Session getSession() {
	if(factory!=null) {
	return factory.openSession();
	}else
		return null;
}
public static void closeSession(Session ses) {
	if(ses!=null) {
		ses.close();
	}
	
}
public static void closeFactory() {
	if(factory!=null) {
		factory.close();
		
	}
}
}
