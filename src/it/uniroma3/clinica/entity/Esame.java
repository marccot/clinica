package it.uniroma3.clinica.entity;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Esame
 *
 */
@Entity

public class Esame implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Paziente paziente;
	@ManyToOne
	private Medico medico;
	@Temporal (TemporalType.DATE)
	private Date dataEsame;
	@Temporal (TemporalType.DATE)
	private Date dataPrenotazione;
	private static final long serialVersionUID = 1L;

	public Esame() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Paziente getPaziente() {
		return this.paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}   
	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}   
	public Date getDataEsame() {
		return this.dataEsame;
	}

	public void setDataEsame(Date dataEsame) {
		this.dataEsame = dataEsame;
	}   
	public Date getDataPrenotazione() {
		return this.dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
   
}
