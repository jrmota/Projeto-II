/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author dj002
 */
public class Listando {
        public static void main (String args[]){
        UsuarioRepository ur = new UsuarioRepository();
        
        List<Usuario> usuarios = ur.buscaTodos();

        for (Usuario usr : usuarios) {
            System.out.println("O Nome do Usuario é : " + usr.getNome());
            System.out.println("O Id do Usuario é : " + usr.getId());
        }

    }
}
