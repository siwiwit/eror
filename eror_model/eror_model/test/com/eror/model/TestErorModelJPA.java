package com.eror.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.junit.Before;
import org.junit.Test;

import com.eror.model.sys.SysUser;

public class TestErorModelJPA {

	EntityManager em;
	@Before
	public void setup(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estate_report_model");
		em = emf.createEntityManager();
	}
	@Test
	public void testSysUser(){
		//setup();
		EntityTransaction tx = em.getTransaction();
		try
		{
		    tx.begin();
		    SysUser sysUser = new SysUser();
		    sysUser.setUserName("ABCD");
		    //Inventory inv = new Inventory("My Inventory");
		    //Product product = new Product("Sony Discman", "A standard discman from Sony", 49.99);
		    //inv.getProducts().add(product);
		    em.persist(sysUser);

		    tx.commit();
		    System.out.println("Saved");
		}
		finally
		{
		    if (tx.isActive())
		    {
		        tx.rollback();
		    }

		    em.close();
		}
	}
	
	public static void main(String[] args){
		TestErorModelJPA tm = new TestErorModelJPA();
				tm.testSysUser();
	}
}
