package Controlador;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Controlador.HibernateUtil;
import Modelo.Persona;
import java.util.List;
import org.hibernate.SessionFactory;

public class DaoPersona {

    public String Insertar(Persona PersonaN) {
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session = sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.save(PersonaN);
        tx.commit();
        session.close();
        return "Exito";
    }

    public String Eliminar(Persona PersonaN) {
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session = sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(PersonaN);
        tx.commit();
        session.close();
        return "Exito";

    }

    public String actualizar(Persona PersonaN) {
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session = sesionF.openSession();
        Transaction tx = session.beginTransaction();
        session.update(String.valueOf(PersonaN.getId()), PersonaN);
        session.update(String.valueOf(PersonaN.getId()), PersonaN);
        tx.commit();
        session.close();
        return "Exito";
    }
    
    public String getID(int id) {
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session = sesionF.openSession();
        Transaction tx = session.beginTransaction();
        Persona persona = (Persona) session.get(Persona.class,id);
        tx.commit();
        session.close();
        return "Exito";
    }

    public List<Persona> getPersona() {
        SessionFactory sesionF = HibernateUtil.getSessionFactory();
        Session session;
        session = sesionF.openSession();
        Transaction tx = session.beginTransaction();
        List<Persona> lista = session.createQuery("*from persona").list();
        tx.commit();
        session.close();
        return lista;
    }

}
