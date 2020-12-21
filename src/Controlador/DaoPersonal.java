
package Controlador;

import Modelo.Personal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DaoPersonal {
        public String Insertar(Personal PersonalN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(PersonalN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    public String Eliminar(Personal PersonalN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(PersonalN);
        tx.commit();
        session.close();
        return "Exito";
    
    }
    
    public String actualizar(Personal PersonalN){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.update(PersonalN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    
    public List<Personal> getPersonal(){
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session =sesionF.openSession();
        Transaction tx = session.beginTransaction();
        List <Personal>lista = session.createQuery("*from personal").list();
        tx.commit();
        session.close();
        return lista;
    }
    
}
