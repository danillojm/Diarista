package br.com.diaristaAppWeb.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			System.out.println("Iniciando...");
			// configuração de cargas e mapeamentos
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			// constrói uma fábrica de sessão a partir do registro de serviço
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			System.out.println("Sessão Criada ");
		}

		return sessionFactory;
	}
}
