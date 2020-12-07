package sn.TransfertAngular.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.TransfertAngular.entities.Emetteur;
import sn.TransfertAngular.entities.Recepteur;




@Repository
public interface IEmetteur extends JpaRepository<Emetteur, Integer>{

	@Query("select em from Emetteur em where em.idE=:id")
	public Emetteur getById(@Param("idE") int idE);

	public void save(Recepteur em);
}
