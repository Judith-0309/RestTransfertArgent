package sn.TransfertAngular.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.TransfertAngular.entities.Emetteur;
import sn.TransfertAngular.entities.Recepteur;



public interface IEmetteur extends JpaRepository<Emetteur, Integer>{
	

	@Query("select em from Emetteur em where em.idE=?1")
	public Emetteur getById(int idE);
	
	public void delete(Emetteur byId);

	public List<Emetteur>findAll();
}
