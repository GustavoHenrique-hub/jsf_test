package br.enterprise.gusta.jsf_test.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class JPAProducer {
	private final EntityManagerFactory emf =
		      Persistence.createEntityManagerFactory("jsfPU");

		  @Produces
		  @RequestScoped
		  public EntityManager em() {
		    return emf.createEntityManager();
		  }

		  public void close(@Disposes EntityManager em) {
		    if (em.isOpen()) em.close();
		  }
}
