package sn.TransfertAngular.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.TransfertAngular.entities.Emetteur;
import sn.TransfertAngular.entities.Recepteur;




@Repository
public interface IRecepteur{
	
	@Query("select r from Recepteur p where r.idE=:idR")
	public Recepteur getById(@Param("idR") int idR);

	public void save(Recepteur r);

	public void delete(Recepteur byId);

	public List<Recepteur> findAll();

}
