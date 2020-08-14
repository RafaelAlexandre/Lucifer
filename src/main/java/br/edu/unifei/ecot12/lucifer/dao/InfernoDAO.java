package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Inferno;

public class InfernoDAO 
extends AbstractDAO<Inferno,Integer> {
	
	public List<Integer> codigosAnjo(){
		return getEntityManager().createQuery(
		"select inf.codigo from Inferno inf"
		).getResultList();
		
	}

}
