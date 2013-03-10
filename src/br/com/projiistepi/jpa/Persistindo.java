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
public class Persistindo {

    public static void main(String args[]) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("usuario-pu");
        EntityManager manager = factory.createEntityManager();

        Scanner entrada = new Scanner(System.in);

        Usuario usuario = new Usuario();
        System.out.println(" Digite o nome do usuario: ");
        usuario.setNome(entrada.nextLine());
        System.out.println(" Digite a senha do usuario : ");
        usuario.setSenha(entrada.nextLine());
        
        manager.persist(usuario);
        
        manager.getTransaction().begin();
        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }
}
