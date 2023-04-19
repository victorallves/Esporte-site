package br.com.magna.esporte.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public JPAUtil() {

	}

	private static EntityManagerFactory factory;

	public static EntityManager getEntityManager() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("dbesporte");
		}
		return factory.createEntityManager();
	}

}
