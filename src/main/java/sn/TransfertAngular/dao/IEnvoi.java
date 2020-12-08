package sn.TransfertAngular.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.TransfertAngular.entities.Envoi;





public interface IEnvoi extends JpaRepository<Envoi, Integer> {
	
	
	
	
	@Query("select ev from Envoi ev where ev.id=?1")
	public Envoi getById(int id);
	
	@Query("select ev,emet,recept from Envoi ev, Emetteur emet,Recepteur recept where ev.id=?1 and ev.emetteur=emet.id and ev.recepteur=recept.id")
	public Optional<Envoi> getByIdssss(int id);

	@Query("select ev.id ,ev.dateenvoi as dateenvoi,ev.montant,ev.emetteur,ev.recepteur from Envoi ev where ev.id=?1")
	public Optional<Envoi> getAllllll(int id);
	
	
	public void delete(Envoi byId);

	public List<Envoi> findAll();
	
	
	
}