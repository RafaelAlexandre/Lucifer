package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Vitima;

public class VitimaDAO 
extends AbstractDAO<Vitima,Integer> {
	
	public List<Integer> codigosVitima(){
		return getEntityManager().createQuery(
		"select v.codigo from Vitima v"
		).getResultList();
		
	}

}
