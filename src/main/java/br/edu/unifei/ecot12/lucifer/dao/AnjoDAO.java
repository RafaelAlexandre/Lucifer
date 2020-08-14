package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Anjo;

public class AnjoDAO 
extends AbstractDAO<Anjo,Integer> {
	
	public List<Integer> codigosAnjo(){
		return getEntityManager().createQuery(
		"select a.codigo from Anjo a"
		).getResultList();
		
	}

}
