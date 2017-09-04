package br.com.provider.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.provider.dao.ClientDao;
import br.com.provider.model.Client;

@Stateless
public class ClientService {

	@Inject
	ClientDao dao;

	public String findNameByCode(int code) {

		return dao.findNameByCode(code);

	}
}
