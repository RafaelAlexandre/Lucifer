package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Divindade;

public class DivindadeDAO 
extends AbstractDAO<Divindade,Integer> {
	
	public List<Integer> codigosDivindade(){
		return getEntityManager().createQuery(
		"select d.codigo from Divindade d"
		).getResultList();
		
	}

}
