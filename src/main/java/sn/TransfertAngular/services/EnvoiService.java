package sn.TransfertAngular.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import sn.TransfertAngular.dao.IEnvoi;

import sn.TransfertAngular.entities.Envoi;




@RestController
public class EnvoiService {
	
	
	@Autowired
	private IEnvoi envoidao;
	
	@RequestMapping(value="/envois" , method = RequestMethod.GET)
	public List<Envoi>getAll(){
		return envoidao.findAll();
	}
	
	
	@RequestMapping(value="/envois/{id}" , method = RequestMethod.GET)
	@ResponseBody
	public Optional<Envoi> findBy(@PathVariable int id){
		return envoidao.getAllllll(id);
	}
	
	@RequestMapping(value="/envois/update/{id}", method = RequestMethod.PUT)
	public List<Envoi> update(@PathVariable int id,Envoi ev){
		ev.setId(id);
		envoidao.save(ev);
		return envoidao.findAll();
	}
	
	
	@RequestMapping(value="/envois/save", method = RequestMethod.POST)
	public List<Envoi> save(Envoi ev){
		envoidao.save(ev);
	return envoidao.findAll();
		
	}
	
	@RequestMapping(value="/envois/delete/{id}", method = RequestMethod.DELETE)
	public List<Envoi> delete(@PathVariable int id){
		if (envoidao.getById(id) != null) {
			envoidao.delete(envoidao.getById(id));
		
		}
		return envoidao.findAll();
		
		
	}
	
	
	

}
