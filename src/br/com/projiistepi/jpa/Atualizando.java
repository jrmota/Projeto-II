/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

import br.com.projiistepi.model.Categoria;
import br.com.projiistepi.model.CategoriaRepository;

/**
 *
 * @author 41080130
 */
public class Atualizando {
    public static void main(String args[]) {
        CategoriaRepository cr = new CategoriaRepository();
        Categoria cat = cr.busca(new Long(1));
        System.out.println(cat.getNome());
        //cat.setNome("Persistindo");
        cr.atualiza(cat,"Persistindo");
    }
    
}
