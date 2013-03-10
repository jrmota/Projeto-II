/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author dj002
 */
public class Buscando {
       public static void main (String args[]){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("usuario-pu");
        EntityManager manager = factory.createEntityManager();

        //TODO implementar codigo de busca

        manager.close();
        factory.close();
    }
}
