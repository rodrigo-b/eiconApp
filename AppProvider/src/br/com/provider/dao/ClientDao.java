package br.com.provider.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.provider.model.Client;

/**
 * @author Rodrigo
 * @version 1.0
 */
@Stateless
public class ClientDao {

	@PersistenceContext
	private EntityManager manager;

	public String findNameByCode(int code) {

		Client client = manager.find(Client.class, code);
		String name = client.getName();
		return name;

	}

}
