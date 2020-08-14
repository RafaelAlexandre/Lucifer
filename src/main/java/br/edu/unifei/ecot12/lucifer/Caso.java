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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Caso implements Serializable{

	private static final long serialVersionUID = 5655171273686356131L;
	
	@Id
	@GeneratedValue
    private int numero;
    private String tipo;
    
	@ElementCollection(targetClass = Prova.class) 
    private List <Prova> provas = new ArrayList<>();
    
}
