package sn.TransfertAngular.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/recepteurs/update/{id}", method = RequestMethod.PUT)
	public List<Recepteur> update(@PathVariable int idR,Recepteur r){
		r.setIdR(idR);
		recepteurdao.save(r);
		return recepteurdao.findAll();
	}
	
	
	@RequestMapping(value="/recepteurs/save", method = RequestMethod.POST)
	public List<Recepteur> save(Recepteur r){
		recepteurdao.save(r);
	return recepteurdao.findAll();
	}
	
	@RequestMapping(value="/recepteurs/delete/{id}", method = RequestMethod.DELETE)
	public List<Recepteur> delete(@PathVariable int idR){
		if (recepteurdao.getById(idR) != null) {
			recepteurdao.delete(recepteurdao.getById(idR));
		}
		return recepteurdao.findAll();
	}
	
	
}
