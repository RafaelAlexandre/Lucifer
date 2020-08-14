package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Caso;

public class CasoDAO 
extends AbstractDAO<Caso,Integer> {
	
	public List<Integer> numerosCaso(){
		return getEntityManager().createQuery(
		"select c.numero from Caso c"
		).getResultList();
		
	}

}
