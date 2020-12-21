package Modelo;
// Generated 18-dic-2020 16:35:14 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * TipoArea generated by hbm2java
 */
public class TipoArea  implements java.io.Serializable {


     private int id;
     private String nombreTipo;
     private Set areas = new HashSet(0);

    public TipoArea() {
    }

	
    public TipoArea(int id) {
        this.id = id;
    }
    public TipoArea(int id, String nombreTipo, Set areas) {
       this.id = id;
       this.nombreTipo = nombreTipo;
       this.areas = areas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreTipo() {
        return this.nombreTipo;
    }
    
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    public Set getAreas() {
        return this.areas;
    }
    
    public void setAreas(Set areas) {
        this.areas = areas;
    }




}


