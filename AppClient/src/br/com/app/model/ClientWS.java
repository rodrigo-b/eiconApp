package br.com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientWS {
	@Id
	@Column(name = "code", nullable = false)
	private Integer code;

	@Column(name = "name", nullable = false)
	private String name;

	public ClientWS() {

	}

	public ClientWS(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer codigo) {
		this.code = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof ClientWS) {
			ClientWS client = (ClientWS) obj;
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

	public int compareTo(ClientWS client) {
		return code.compareTo(client.getCode());
	}

}
