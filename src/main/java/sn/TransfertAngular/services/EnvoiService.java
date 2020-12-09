package sn.TransfertAngular.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.TransfertAngular.dao.IEmetteur;
import sn.TransfertAngular.dao.IEnvoi;
import sn.TransfertAngular.dao.IRecepteur;
import sn.TransfertAngular.entities.Envoi;




@RestController
public class EnvoiService {
	
	
	@Autowired
	private IEnvoi envoidao;
	@Autowired
	 private IEmetteur emetteurdao;
	 @Autowired
	 private IRecepteur recepteurdao;
	
	@RequestMapping(value="/envois" , method = RequestMethod.GET)
	public List<Envoi>getAll(){
		return envoidao.findAll();
	}
	
	
	@RequestMapping(value="/envois/{id}" , method = RequestMethod.GET)
	@ResponseBody
	public Optional<Envoi> findBy(@PathVariable int id){
		return envoidao.getAllllll(id);
	}
	
	@PutMapping(value="/envois/update/{id}")
	public List<Envoi> update(@PathVariable int id,Envoi ev){
		ev.setId(id);
		envoidao.save(ev);
		return envoidao.findAll();
	}
	
	
	@PostMapping(value="/envois/save")
	public List<Envoi> save(@RequestBody  Envoi ev){
	     emetteurdao.save(ev.getEmetteur());
	     recepteurdao.save(ev.getRecepteur());
		envoidao.save(ev);
		
	return envoidao.findAll();
		
	}
	
	@RequestMapping(value="/envois/delete/{id}", method = RequestMethod.DELETE)
	public List<Envoi> delete(@PathVariable ("id")  int id){
		envoidao.deleteById(id);	
		
		return envoidao.findAll();
		
		
	}
	
	
	

}
