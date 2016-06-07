package it.uniroma3.clinica.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
//test bob 2
/**
 * Entity implementation class for Entity: Amministrazione ciao
 *
 */ 
@Entity

public class Amministrazione implements Serializable {

	/**
	 * Questa classe dovrà probabilmente essere eliminata, ma come conserviamo la password
	 * dell'amministratore in db?
	 */
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	private static final long serialVersionUID = 1L;
	
	public Amministrazione() {
		super();
	}

	public Amministrazione(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
