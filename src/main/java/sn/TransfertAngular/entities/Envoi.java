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
	private String dateenvoi;
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

	public Envoi(int id, String dateenvoi, String montant, Recepteur recepteur, Emetteur emetteur) {
		super();
		this.id = id;
		this.dateenvoi = dateenvoi;
		this.montant = montant;
		this.recepteur = recepteur;
		this.emetteur = emetteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateenvoi() {
		return dateenvoi;
	}

	public void setDateenvoi(String dateenvoi) {
		this.dateenvoi = dateenvoi;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public Recepteur getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(Recepteur recepteur) {
		this.recepteur = recepteur;
	}

	public Emetteur getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(Emetteur emetteur) {
		this.emetteur = emetteur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}
