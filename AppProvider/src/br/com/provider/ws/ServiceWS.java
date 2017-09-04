package br.com.provider.ws;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.provider.service.ClientService;

@WebService
@Stateless
public class ServiceWS {

	@Inject
	ClientService service;

	@WebResult(name = "clientName")
	public String findNameByCode(@WebParam(name = "code") int code) {
		return service.findNameByCode(code);
	}
}
