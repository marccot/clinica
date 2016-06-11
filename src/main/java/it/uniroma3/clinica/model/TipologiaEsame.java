package it.uniroma3.clinica.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Esame
 *
 */
@Entity
@NamedQueries({
@NamedQuery(name="TipologiaEsame.findAll",query="SELECT t FROM TipologiaEsame t"),
})
public class TipologiaEsame implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String descrizione;
	private Double costo;
	@ManyToMany( fetch=FetchType.EAGER)
	private List<Prerequisito> prerequisiti;
	private static final long serialVersionUID = 1L;
	
	public TipologiaEsame() {
		super();
		this.prerequisiti = new ArrayList<Prerequisito>();
	}

	public TipologiaEsame(Long id, String nome, String descrizione, Double costo, List<Prerequisito> prerequisiti) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.prerequisiti = prerequisiti;
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
	
	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	public Double getCosto() {
		return this.costo;
	}
	
	public List<Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}

	public void setPrerequisiti(List<Prerequisito> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((prerequisiti == null) ? 0 : prerequisiti.hashCode());
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
		TipologiaEsame other = (TipologiaEsame) obj;
		if (costo == null) {
			if (other.costo != null)
				return false;
		} else if (!costo.equals(other.costo))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
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
		if (prerequisiti == null) {
			if (other.prerequisiti != null)
				return false;
		} else if (!prerequisiti.equals(other.prerequisiti))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return this.nome ;
	}
}
