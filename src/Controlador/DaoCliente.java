package Controlador;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Controlador.HibernateUtil;
import Modelo.Cliente;
import java.util.List;
import org.hibernate.SessionFactory;


public class DaoCliente {
    
//    SessionFactory sesionF;
//    private Session session;
//    private Transaction transaction;
//    
    
    public String Insertar(Cliente ClienteN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ClienteN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    public String Eliminar(Cliente ClienteN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(ClienteN);
        tx.commit();
        session.close();
        return "Exito";
    
    }
    
    public String actualizar(Cliente ClienteN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.update(String.valueOf(ClienteN.getId()), ClienteN);
        tx.commit();
        session.close();
        //return ClienteN.getId();
        return "Exito";
    }
    
    
    public List<Cliente> getCliente(){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        List <Cliente>lista = session.createQuery("*from cliente").list();
        tx.commit();
        session.close();
        return lista;
    }
    
    
    
}
