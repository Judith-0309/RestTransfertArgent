package sn.TransfertAngular.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import sn.TransfertAngular.entities.Recepteur;



public interface IRecepteur extends JpaRepository<Recepteur, Integer>{
	
	@Query("select p from Recepteur p where p.idR=?1")
	public Recepteur getById(int idR);

	public void delete(Recepteur byId);

	public List<Recepteur> findAll();

}
