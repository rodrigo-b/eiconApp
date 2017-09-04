package br.com.app.main;

import java.rmi.RemoteException;

import br.com.app.dao.ClientWsDao;
import br.com.app.model.ClientWS;
import br.com.provider.ws.ServiceWS;
import br.com.provider.ws.ServiceWSProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {

		ClientWsDao dao = new ClientWsDao();
		ServiceWS service = new ServiceWSProxy();

		ClientWS client;

		try {
			for (int i = 1; i <= 3; i++) {
				String name = service.findNameByCode(i);
				client = new ClientWS(i, name);
				dao.saveClientWs(client);
			}
			dao.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.closeConnection();
	}
}
