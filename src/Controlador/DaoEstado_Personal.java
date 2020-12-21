

package Controlador;

import Modelo.EstadoPersonal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author IVEG
 */
public class DaoEstado_Personal {
    
        public String Insertar(EstadoPersonal EstadoPersonalN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(EstadoPersonalN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    public String Eliminar(EstadoPersonal EstadoPersonalN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(EstadoPersonalN);
        tx.commit();
        session.close();
        return "Exito";
    
    }
    
    public String actualizar(EstadoPersonal EstadoPersonalN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.update(EstadoPersonalN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    
    public List<EstadoPersonal> getEstadoPersonal(){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        List <EstadoPersonal>lista = session.createQuery("*from estado_personal").list();
        tx.commit();
        session.close();
        return lista;
    }
}
