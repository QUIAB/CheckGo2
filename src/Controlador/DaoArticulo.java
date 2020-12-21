package Controlador;

import Modelo.Articulo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author IVEG
 */
public class DaoArticulo {
    
        public String Insertar(Articulo ArticuloN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ArticuloN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    public String Eliminar(Articulo ArticuloN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(ArticuloN);
        tx.commit();
        session.close();
        return "Exito";
    
    }
    
    public String actualizar(Articulo ArticuloN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.update(ArticuloN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    
    public List<Articulo> getArticulo(){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        List <Articulo>lista = session.createQuery("*from articulo").list();
        tx.commit();
        session.close();
        return lista;
    }
    
}
