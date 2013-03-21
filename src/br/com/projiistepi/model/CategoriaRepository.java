/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.model;

/**
 *
 * @author 41080130
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CategoriaRepository {

    private EntityManager manager;
    private EntityManagerFactory factory;

    private void inicializa() {
        factory = Persistence.createEntityManagerFactory("usuario-pu");
        manager = factory.createEntityManager();
    }

    private void finaliza() {
        manager.close();
        factory.close();
    }

    public void adiciona(Categoria e) {
        inicializa();
        this.manager.persist(e);
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        finaliza();
    }

    public Categoria busca(Long id) {
        Categoria u;
        inicializa();
        u = this.manager.find(Categoria.class, id);
        finaliza();
        return u;
    }
    
    public void atualiza(Categoria c, String newNome) {
        inicializa();
        c.setNome(newNome);
        manager.refresh(manager.merge(c));
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        finaliza();
    }
    
    public void deleta(Categoria u) {
        inicializa();
        if (u == null){
            System.out.println("Objeto = null. Objeto não deletado.");
            return;
        }
        this.manager.remove(manager.merge(u));
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        finaliza();
    }

    public List< Categoria> buscaTodos() {
        List< Categoria> us;
        inicializa();
        Query query = this.manager.createQuery(" SELECT u FROM Categoria u");
        us = query.getResultList();
        finaliza();
        return us;
    }
}