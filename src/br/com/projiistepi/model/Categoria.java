/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author 41080130
 */
@Entity
public class Categoria implements Serializable {
    

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
