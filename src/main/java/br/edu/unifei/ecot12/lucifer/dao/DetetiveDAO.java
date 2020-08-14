package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Detetive;

public class DetetiveDAO 
extends AbstractDAO<Detetive,Integer> {
	
	public List<Integer> codigosDetetive(){
		return getEntityManager().createQuery(
		"select d.codigo from Detetive d"
		).getResultList();
		
	}

}
