/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

import mx.unam.ciencias.is.mapeobd.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hectorsama
 */
public class UsuarioDAO {
    
     /*Sesion para conectarnos a la base de datos*/
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    /**
     * Guarda un marcador a la base de datos 
     * @param marcador el marcador a guardar.
     */
    public void guardar(Usuario usuario) {
        //se inicia la sesion
        Session session = sessionFactory.openSession();
        //la transaccion a relizar
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            //guardamos el usuario
            session.persist(usuario);
           
            tx.commit();
        }
        catch (Exception e) {
            //Se regresa a un estado consistente 
            if (tx!=null){ 
                tx.rollback();
            }
            e.printStackTrace(); 
        }
        finally {
            //cerramos simpre la sesion
            session.close();
        }
    
    }
    public void eliminar(Usuario usuario){
    //Se inicia la sesión
    Session session = sessionFactory.openSession();
    Transaction tx=null;
    try{
    tx=session.beginTransaction();
    session.delete(usuario);
    tx.commit();
    
    }catch(Exception e){
        if(tx!=null){
        
        tx.rollback();
        }
        e.printStackTrace();
    
    }
    finally {
            //cerramos simpre la sesion
            session.close();
        }
    
    }
    
    
    
}
