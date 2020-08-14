/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ecot12.lucifer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Prova implements Serializable{
    
	private static final long serialVersionUID = 2538086550536047092L;
	
	@Id
	@GeneratedValue
	private int codigo;
}
