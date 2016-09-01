package controller;

import javax.persistence.EntityManager;

import model.Animal;
import util.JpaUtil;

public class AnimalDAO {

	private EntityManager em;

	public AnimalDAO() {
		em = JpaUtil.getFactory();
	}

	public boolean salvarAnimal(Animal animal) {
		try {
			em.persist(animal);
			em.flush();
			em.getTransaction().commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
