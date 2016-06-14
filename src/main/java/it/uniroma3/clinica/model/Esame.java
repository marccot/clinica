package it.uniroma3.clinica.model;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Esame
 *
 */
@Entity
@NamedQueries({
@NamedQuery(name="Esame.findAll",query="SELECT e FROM Esame e"),
@NamedQuery(name="Esame.findByPaziente", query="SELECT e FROM Esame e WHERE e.paziente.id = :id"),
@NamedQuery(name="Esame.findByMedico", query="SELECT e FROM Esame e WHERE e.medico.id = :id")
})
public class Esame implements Serializable {
 
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Paziente paziente;
	@ManyToOne
	private Medico medico; 
	@ManyToOne
	private TipologiaEsame tipologia;
	@Temporal (TemporalType.DATE)
	private Date dataEsame;
	@Temporal (TemporalType.DATE)
	private Date dataPrenotazione;
	@OneToMany(fetch = FetchType.EAGER, mappedBy="esame")
	private List<Risultato> risultati;
	private static final long serialVersionUID = 1L;

	public Esame() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public List<Risultato> getRisultati(){
		return this.risultati;
	}
	
	public void setRisultati(List<Risultato> risultati){
		this.risultati = risultati;
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
	public TipologiaEsame getTipologia() {
		return tipologia;
	}
	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}
	
}
