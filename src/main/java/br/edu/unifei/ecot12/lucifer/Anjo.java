/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ecot12.lucifer;

import javax.persistence.Entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Anjo extends Ser {
	
	private static final long serialVersionUID = 908279151746537579L;
	private String corAsa;
    private String poder;    
    
}
