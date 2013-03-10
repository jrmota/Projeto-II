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
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("usuario-pu");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("SELECT u FROM Usuario u");
        List<Usuario> usuarios = query.getResultList();

        for (Usuario usr : usuarios) {
            System.out.println("O Nome do Usuario é : " + usr.getNome());
        }

        manager.close();
        factory.close();
    }
}
