package com.generation.freelancerweb.helpers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class HibernateHelper
{
	private static EntityManager entityManager;

	public static EntityManager getEntityManager()
	{
		if(entityManager==null)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}
}
