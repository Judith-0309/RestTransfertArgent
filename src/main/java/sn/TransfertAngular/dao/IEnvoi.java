package sn.TransfertAngular.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.TransfertAngular.entities.Envoi;

public interface IEnvoi extends JpaRepository<Envoi, Integer> {
	
}