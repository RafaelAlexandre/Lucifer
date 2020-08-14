package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Arma;

public class ArmaDAO 
extends AbstractDAO<Arma,Integer> {
	
	public List<Integer> codigosArma(){
		return getEntityManager().createQuery(
		"select a.codigo from Arma a"
		).getResultList();
		
	}

}
