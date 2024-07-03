package com.sp.main.JPAusingXML;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sp.entity.Account;

public class App {

    public static void main(String[] args) {

        // Create a new Account instance
      

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        
        try
        {
        	
        	Account acc=entityManager.find(Account.class, 144);
        
        	
        	System.out.println("-----------Account Details-------");
        	System.out.println(acc.getAccount_num());
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	
       
        	System.out.println("fail");
        }
        finally
        {
        	entityManager.close();
        	entityManagerFactory.close();
        }
    }
}
