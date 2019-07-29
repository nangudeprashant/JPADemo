package com.jpademo.JPADemo;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceProviderResolver;
import javax.persistence.spi.PersistenceProviderResolverHolder;

//import antlr.collections.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//List providers=new LinkedList<PersistenceProvider>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("customerManager");
		EntityManager em = emf.createEntityManager();
		Employee employee = new Employee();//em.find(Employee.class, 1);
//		System.out.println(employee.toString());
		PersistenceProviderResolver resolver = PersistenceProviderResolverHolder.getPersistenceProviderResolver();
		java.util.List<PersistenceProvider> providers = resolver.getPersistenceProviders();
		System.out.println(providers.toString());
		
		employee.setEmpID(22);
		employee.seteName("OldName");
		
		/* Persist entity */
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
 
		/* Retrieve entity */
		employee = em.find(Employee.class, 22);
		System.out.println(employee.toString());
 
		/* Update entity */
		em.getTransaction().begin();
		employee. seteName("Pranil");
		System.out.println("Employee after updation :- " + employee.toString());
		em.getTransaction().commit();
 
		/* Remove entity */
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
 
		/* Check whether enittiy is removed or not */
		employee = em.find(Employee.class, 1);
		System.out.println("Employee after removal :- " + employee);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
