/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projiistepi.model;

/**
 *
 * @author dj002
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UsuarioRepository {

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

    public UsuarioRepository() {
    }

    public void adiciona(Usuario e) {
        inicializa();
        this.manager.persist(e);
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        finaliza();
    }

    public Usuario busca(Long id) {
        Usuario u;
        inicializa();
        u = this.manager.find(Usuario.class, id);
        finaliza();
        return u;
    }
    
    public void Atualiza(Usuario u) {
        inicializa();
        this.manager.refresh(u);
        finaliza();
    }
    
    public void deleta(Usuario u) {
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

    public List< Usuario> buscaTodos() {
        List< Usuario> us;
        inicializa();
        Query query = this.manager.createQuery(" SELECT u FROM Usuario u");
        us = query.getResultList();
        finaliza();
        return us;
    }
}