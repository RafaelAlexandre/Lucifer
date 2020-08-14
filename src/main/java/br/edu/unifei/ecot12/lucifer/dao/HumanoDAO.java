package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Humano;

public class HumanoDAO 
extends AbstractDAO<Humano,Object> {
	
	public List<Integer> codigosHumano(){
		return getEntityManager().createQuery(
		"select h.codigo from Humano h"
		).getResultList();
		
	}

}
