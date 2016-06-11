package it.uniroma3.clinica.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

/**
 * Entity implementation class for Entity: Paziente
 *
 */
@Entity
@Table(name = "paziente")
@NamedQuery(name="Paziente.findAll",query="SELECT p FROM Paziente p")
public class Paziente implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	private String codiceFiscale;
	private String codice;
	private static final long serialVersionUID = 1L;

	public Paziente() {
		super();
	}   
	
	public Paziente(Long id, String nome, String cognome, String codice, String codiceFiscale) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.codiceFiscale = codiceFiscale;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}
	
	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}   
	public String getCodice() {
		return this.codice;
	}
	
	public String getNomeCognome() {
		return this.nome + " " + this.cognome;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Paziente other = (Paziente) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (codiceFiscale == null) {
			if (other.codiceFiscale != null)
				return false;
		} else if (!codiceFiscale.equals(other.codiceFiscale))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome;
	}
   
}
