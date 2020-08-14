package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Demonio;

public class DemonioDAO 
extends AbstractDAO<Demonio,Integer> {
	
	public List<Integer> codigosDemonio(){
		return getEntityManager().createQuery(
		"select d.codigo from Demonio d"
		).getResultList();
		
	}

}
