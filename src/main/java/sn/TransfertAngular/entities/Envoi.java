package sn.TransfertAngular.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "envoi")
public class Envoi implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private Date dateenvoi;
	private String montant;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recepteur", referencedColumnName = "idR")
    private Recepteur recepteur;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emetteur", referencedColumnName = "idE")
    private Emetteur emetteur;
	
	public Envoi() {
		super();
	}


	public Envoi(int id, Date dateenvoi, String montant, Emetteur emetteur, Recepteur recepteur) {
		super();
		this.id = id;
		this.dateenvoi = dateenvoi;
		this.montant = montant;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDateenvoi() {
		return dateenvoi;
	}


	public void setDateenvoi(Date dateenvoi) {
		this.dateenvoi = dateenvoi;
	}


	public String getMontant() {
		return montant;
	}


	public void setMontant(String montant) {
		this.montant = montant;
	}


}
