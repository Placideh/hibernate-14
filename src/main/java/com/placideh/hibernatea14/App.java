package com.placideh.hibernatea14;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 * Hello world!
 * HERE WE ARE USING JPA 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien alien=new Alien();
    	alien.setAid(6);
    	alien.setAname("Placha");
    	alien.setTech("Python");
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(alien);
    	em.getTransaction().commit();
    	Alien a =em.find(Alien.class,2);
    	System.out.println(a);
    }
}
