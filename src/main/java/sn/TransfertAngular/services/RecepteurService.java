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

import sn.TransfertAngular.dao.IRecepteur;
import sn.TransfertAngular.entities.Recepteur;




@RestController
public class RecepteurService {

	@Autowired
	private IRecepteur recepteurdao;
	
	@RequestMapping(value="/recepteurs" , method = RequestMethod.GET)
	public List<Recepteur>getAll(){
		return recepteurdao.findAll();
	}
	
	@PutMapping(value="/recepteurs/update/{id}")
	public List<Recepteur> update(@PathVariable int idR,Recepteur r){
		r.setIdR(idR);
		recepteurdao.save(r);
		return recepteurdao.findAll();
	}
	
	
	@PostMapping(value="/recepteurs/save")
	public List<Recepteur> save(@RequestBody  Recepteur r){
		recepteurdao.save(r);
	return recepteurdao.findAll();
	}
	
	@DeleteMapping(value="/recepteurs/delete/{id}")
	public List<Recepteur> delete(@PathVariable ("id") int idR){

		recepteurdao.deleteById(idR);	
		
		return recepteurdao.findAll();
		
	}
	
	
}
