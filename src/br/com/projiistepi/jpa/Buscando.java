/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

import br.com.projiistepi.model.Usuario;
import br.com.projiistepi.model.UsuarioRepository;
/**
 *
 * @author dj002
 */
public class Buscando {
       public static void main (String args[]){
        Usuario usuario = new Usuario();
        UsuarioRepository ur = new UsuarioRepository();
        
        usuario = ur.busca(new Long(1));
        
        System.out.println(usuario.getNome());
    }
}
