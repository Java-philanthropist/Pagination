package com.sv.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sv.entity.products;
import com.sv.util.Hibernate_Utility;

public class Test_Update {
public static void main(String[] args) {
	products prod=null;
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	try {
		
		ses=Hibernate_Utility.getSession();
		if(ses!=null) {
			tx=ses.beginTransaction();
			prod=ses.get(products.class,1);
			if(prod!=null) {
				prod.setpCatagory("smallphone");
			    flag=true;
			}
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(flag) {
			if(tx!=null)
			tx.commit();
		}else {
			if(tx!=null)
			tx.rollback();
		}
		Hibernate_Utility.closeSession(ses);
		Hibernate_Utility.closeFactory();
	}
}
}
