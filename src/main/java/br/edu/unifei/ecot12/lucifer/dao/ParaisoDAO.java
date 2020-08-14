package br.edu.unifei.ecot12.lucifer.dao;

import java.util.List;

import br.edu.unifei.ecot12.lucifer.dao.AbstractDAO;
import br.edu.unifei.ecot12.lucifer.Paraiso;

public class ParaisoDAO 
extends AbstractDAO<Paraiso,Integer> {
	
	public List<Integer> codigoParaiso(){
		return getEntityManager().createQuery(
		"select p.codigo from Paraiso p"
		).getResultList();
		
	}

}
