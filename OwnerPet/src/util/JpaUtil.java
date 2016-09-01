package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManager em;
	private static EntityManagerFactory factory;

	static {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			em = factory.createEntityManager();

		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public static EntityManager getFactory() {
		if(!em.getTransaction().isActive())
			em.getTransaction().begin();
		return em;
	}

	public static void closeFactory() {
		em.close();
	}
}
