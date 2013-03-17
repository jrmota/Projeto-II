/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

/**
 *
 * @author dj002
 */
public class Deletando {
    public static void main (String args[]){
        Usuario usuario = new Usuario();
        UsuarioRepository ur = new UsuarioRepository();
        
        usuario = ur.busca(new Long(5));
        
        ur.deleta(usuario);
        
        if (!(usuario == null)) System.out.println(usuario.getNome());
    }
}
