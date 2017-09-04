package br.com.app.dao;

import javax.persistence.EntityManager;

import br.com.app.model.ClientWS;
import br.com.app.util.JPAUtil;

/**
 * @author Rodrigo
 * @version 1.0
 */
public class ClientWsDao {

	private EntityManager manager;

	public ClientWsDao() {
		manager = new JPAUtil().getEntityManager();
	}

	public void saveClientWs(ClientWS clientWs) {
		try {
			manager.getTransaction().begin();
			manager.persist(clientWs);
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
