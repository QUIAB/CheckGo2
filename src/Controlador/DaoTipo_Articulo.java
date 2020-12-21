
package Controlador;

import Modelo.TipoArticulo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author IVEG
 */
public class DaoTipo_Articulo {
    
        public String Insertar(TipoArticulo TipoArticuloN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(TipoArticuloN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    public String Eliminar(TipoArticulo TipoArticuloN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(TipoArticuloN);
        tx.commit();
        session.close();
        return "Exito";
    
    }
    
    public String actualizar(TipoArticulo TipoArticuloN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.update(TipoArticuloN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    
    public List<TipoArticulo> getCliente(){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        List <TipoArticulo>lista = session.createQuery("*from tipo_articulo").list();
        tx.commit();
        session.close();
        return lista;
    }
    
}
