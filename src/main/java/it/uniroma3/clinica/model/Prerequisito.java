package it.uniroma3.clinica.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prerequisito
 *
 */
@Entity
@NamedQuery(name="Prerequisito.findAll", query="SELECT p FROM Prerequisito p")
public class Prerequisito implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String valore;
	@ManyToMany(fetch = FetchType.EAGER , mappedBy="prerequisiti")
	private List<TipologiaEsame> tipologiaEsame;
	private static final long serialVersionUID = 1L;

	public Prerequisito() {
		super();
	}   
	
	public Prerequisito( String nome, String valore, List<TipologiaEsame> tipologiaEsame) {
		super();
		this.nome = nome;
		this.valore = valore;
		this.tipologiaEsame = tipologiaEsame;
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
	
	public String getValore() {
		return this.valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}   
	
	public List<TipologiaEsame> getEsame() {
		return this.tipologiaEsame;
	}

	public void setEsame(List<TipologiaEsame> tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipologiaEsame == null) ? 0 : tipologiaEsame.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((valore == null) ? 0 : valore.hashCode());
		return result;
	}

	@Override
	public String toString(){
		return this.nome + this.valore;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prerequisito other = (Prerequisito) obj;
		if (tipologiaEsame == null) {
			if (other.tipologiaEsame != null)
				return false;
		} else if (!tipologiaEsame.equals(other.tipologiaEsame))
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
		if (valore == null) {
			if (other.valore != null)
				return false;
		} else if (!valore.equals(other.valore))
			return false;
		return true;
	}
	
	
   
}
