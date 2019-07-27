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
		EntityManager manager = emf.createEntityManager();
		Employee employee = manager.find(Employee.class, 2);
		System.out.println(employee.toString());
		PersistenceProviderResolver resolver = PersistenceProviderResolverHolder.getPersistenceProviderResolver();
		java.util.List<PersistenceProvider> providers = resolver.getPersistenceProviders();
		System.out.println(providers.toString());
	}
}
