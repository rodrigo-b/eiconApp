package br.com.app.dao;

import javax.persistence.EntityManager;

import br.com.app.model.Client;
import br.com.app.util.JPAUtil;

public class ClientDao {

	private static EntityManager manager;

	public ClientDao() {
		manager = new JPAUtil().getEntityManager();
	}

	public void save(Client client) {

		try {
			manager.getTransaction().begin();
			manager.persist(client);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}

	}

	public void closeConnection() {
		JPAUtil.close();
	}
}
