package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Reu;

public class ReuDAO 
extends AbstractDAO<Reu,Integer> {
	
	public List<Integer> codigosReu(){
		return getEntityManager().createQuery(
		"select r.codigo from Reu r"
		).getResultList();
		
	}

}
