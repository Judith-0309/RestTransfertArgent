package sn.TransfertAngular.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "recepteur")
public class Recepteur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int idR;
	private String nomR;
	private String prenomR;
	private String telR;
	private String cni;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "envoi", referencedColumnName = "id")
    private Envoi envoi;
	
	
	public Recepteur() {
		super();
	}


	public Recepteur(int idR, String nomR, String prenomR, String telR, String cni, Envoi envoi) {
		super();
		this.idR = idR;
		this.nomR = nomR;
		this.prenomR = prenomR;
		this.telR = telR;
		this.cni = cni;
	}


	public int getIdR() {
		return idR;
	}


	public void setIdR(int idR) {
		this.idR = idR;
	}


	public String getNomR() {
		return nomR;
	}


	public void setNomR(String nomR) {
		this.nomR = nomR;
	}


	public String getPrenomR() {
		return prenomR;
	}


	public void setPrenomR(String prenomR) {
		this.prenomR = prenomR;
	}


	public String getTelR() {
		return telR;
	}


	public void setTelR(String telR) {
		this.telR = telR;
	}


	public String getCni() {
		return cni;
	}


	public void setCni(String cni) {
		this.cni = cni;
	}
	
}
