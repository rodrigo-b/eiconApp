package br.com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@Column(name = "code", nullable = false)
	private Integer code;

	@Column(name = "name", nullable = false)
	private String name;

	public Client() {

	}

	public Client(Integer code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Client) {
			Client client = (Client) obj;
			if (client.getCode() != 0) {
				return client.getCode().equals(code);
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return code.hashCode();
	}

	public int compareTo(Client client) {
		return code.compareTo(client.getCode());
	}

}
