/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ecot12.lucifer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public abstract class Ser implements Serializable{
  
	private static final long serialVersionUID = 718497609367215903L;
	
	@Id
	@GeneratedValue
	private int codigo;
	private String nome;
	private String sexo;
	
	@ElementCollection(targetClass = PecadoEnum.class) 
    private List <PecadoEnum> pecados = new ArrayList<>();
}

