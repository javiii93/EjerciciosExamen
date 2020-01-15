package net.codejava.hibernate;

import org.hibernate.SessionFactoary;
import org.hibernate.cfg.Configuration;

public class sessionFactoryUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory= new Configuration().configure().buildSessionFactory();
		}
		catch (Throwable ex)
		{
			System.err.println("Error al crear el sessionfactory inicial");
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
