package sn.TransfertAngular.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PutMapping(value="/emetteurs/update/{id}")
	public List<Emetteur> update(@PathVariable int idE,Emetteur em){
		em.setIdE(idE);
		emetteurdao.save(em);
		return emetteurdao.findAll();
	}
	
	
	@PostMapping(value="/emetteurs/save")
	public List<Emetteur> save(@RequestBody  Emetteur em){
		emetteurdao.save(em);
	return emetteurdao.findAll();
		
	}
	
	@DeleteMapping(value="/emetteurs/delete/{id}")
	public List<Emetteur> delete(@PathVariable("id") int idE){

		emetteurdao.deleteById(idE);	
		
		return emetteurdao.findAll();
		
		
	}
	

}
