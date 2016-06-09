package it.uniroma3.clinica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Utente.findAll",query="SELECT u FROM Utente u")
public class Utente implements Serializable {


//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	@Id
	@Column(unique = true)
	private String username;
	private String password;
	private String ruolo;
	private static final long serialVersionUID = 1L;
	
	public Utente() {
		super();
	}

	public Utente(String username, String password, String ruolo) {
		super();
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	/**
	 * considera ancora la password passata in chiaro
	 * @param password
	 * @return true se la password inserita è corretta
	 */
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	public boolean isAdmin() {
		return this.ruolo.equals("admin");
	}
	
	
	@Override
	public String toString() {
		return "Utente [username=" + username + ", password=" + password + ", ruolo=" + ruolo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
