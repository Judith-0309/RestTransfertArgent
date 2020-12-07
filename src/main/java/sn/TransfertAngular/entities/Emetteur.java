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
@Table(name = "emetteur")
public class Emetteur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idE;
	private String nomE;
	private String prenomE;
	private String telephone;
	private String cni;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "envoi", referencedColumnName = "id")
    private Envoi envoi;

	
	public Emetteur() {
		super();
	}


	public Emetteur(int idE, String nomE, String prenomE, String telephone, String cni) {
		super();
		this.idE = idE;
		this.nomE = nomE;
		this.prenomE = prenomE;
		this.telephone = telephone;
		this.cni = cni;
	}




	public int getIdE() {
		return idE;
	}




	public void setIdE(int idE) {
		this.idE = idE;
	}




	public String getNomE() {
		return nomE;
	}




	public void setNomE(String nomE) {
		this.nomE = nomE;
	}




	public String getPrenomE() {
		return prenomE;
	}




	public void setPrenomE(String prenomE) {
		this.prenomE = prenomE;
	}




	public String getTelephone() {
		return telephone;
	}




	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	public String getCni() {
		return cni;
	}




	public void setCni(String cni) {
		this.cni = cni;
	}

	
}
