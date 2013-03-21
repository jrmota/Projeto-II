/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

import br.com.projiistepi.model.Categoria;
import br.com.projiistepi.model.CategoriaRepository;

/**
 *
 * @author dj002
 */
public class GeraUsuario {

    public static void main (String args[]){
        Categoria categoria = new Categoria();
        CategoriaRepository ur = new CategoriaRepository();
        
        categoria = ur.busca(new Long(1));
        
        System.out.println(categoria.getNome());
    }
}
