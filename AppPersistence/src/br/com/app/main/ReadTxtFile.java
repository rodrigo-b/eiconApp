package br.com.app.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import br.com.app.dao.ClientDao;
import br.com.app.model.Client;

public class ReadTxtFile {

	public static void main(String[] args) throws IOException {

		ClientDao dao = new ClientDao();

		InputStream file = new FileInputStream("src/br/com/app/files/clients.txt");
		try {
			InputStreamReader scan = new InputStreamReader(file);
			BufferedReader buffer = new BufferedReader(scan);
			String data = "";
			String content = "";
			while ((data = buffer.readLine()) != null) {
				String[] dataArray = data.split(";");
				int code = Integer.parseInt(dataArray[0]);
				String name = dataArray[1];
				Client client = new Client(code, name);
				content += code + " " + name + "\n";
				dao.save(client);
			}
			dao.closeConnection();
			System.out.println("The file Content: " + "\n\n" + content);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
