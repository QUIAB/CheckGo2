package Modelo;
// Generated 18-dic-2020 16:35:14 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoPersonal generated by hbm2java
 */
public class EstadoPersonal  implements java.io.Serializable {


     private int id;
     private String estado;
     private Set personals = new HashSet(0);

    public EstadoPersonal() {
    }

	
    public EstadoPersonal(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }
    public EstadoPersonal(int id, String estado, Set personals) {
       this.id = id;
       this.estado = estado;
       this.personals = personals;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getPersonals() {
        return this.personals;
    }
    
    public void setPersonals(Set personals) {
        this.personals = personals;
    }




}


