package sn.TransfertAngular.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sn.TransfertAngular.dao.IEmetteur;
import sn.TransfertAngular.entities.Emetteur;




@RestController
public class EmetteurService {

	@Autowired
	private IEmetteur emetteurdao;
	
	@RequestMapping(value="/emetteurs" , method = RequestMethod.GET)
	public List<Emetteur>getAll(){
		return emetteurdao.findAll();
	}
	
	@RequestMapping(value="/emetteurs/update/{id}", method = RequestMethod.PUT)
	public List<Emetteur> update(@PathVariable int idE,Emetteur em){
		em.setIdE(idE);
		emetteurdao.save(em);
		return emetteurdao.findAll();
	}
	
	
	@RequestMapping(value="/emetteurs/save", method = RequestMethod.POST)
	public List<Emetteur> save(Emetteur em){
		emetteurdao.save(em);
	return emetteurdao.findAll();
		
	}
	
	@RequestMapping(value="/emetteurs/delete/{id}", method = RequestMethod.DELETE)
	public List<Emetteur> delete(@PathVariable int idE){
		if (emetteurdao.getById(idE) != null) {
			emetteurdao.delete(emetteurdao.getById(idE));
		
		}
		return emetteurdao.findAll();
		
		
	}
	

}
