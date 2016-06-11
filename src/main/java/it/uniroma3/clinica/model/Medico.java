package it.uniroma3.clinica.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medico
 *
 */
@Entity
@Table(name = "medico")
@NamedQuery(name="Medico.findAll",query="SELECT m FROM Medico m")
public class Medico implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	private String specializzazione;
	private static final long serialVersionUID = 1L;

	public Medico() {
		super();
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
	public String getCognome() {
		return this.cognome;
	}
	
	public String getNomeCognome() {
		return this.nome + " " + this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	   
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Medico other = (Medico) obj;
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
