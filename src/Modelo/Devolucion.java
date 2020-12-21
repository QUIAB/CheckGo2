package Modelo;
// Generated 18-dic-2020 16:35:14 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Devolucion generated by hbm2java
 */
public class Devolucion  implements java.io.Serializable {


     private int id;
     private Date fecha;
     private String observaciones;
     private Set prestamos = new HashSet(0);

    public Devolucion() {
    }

	
    public Devolucion(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    public Devolucion(int id, Date fecha, String observaciones, Set prestamos) {
       this.id = id;
       this.fecha = fecha;
       this.observaciones = observaciones;
       this.prestamos = prestamos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Set getPrestamos() {
        return this.prestamos;
    }
    
    public void setPrestamos(Set prestamos) {
        this.prestamos = prestamos;
    }




}


