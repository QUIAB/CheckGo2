package Modelo;
// Generated 18-dic-2020 16:35:14 by Hibernate Tools 3.6.0



/**
 * ArticuloTieneSolicitud generated by hbm2java
 */
public class ArticuloTieneSolicitud  implements java.io.Serializable {


     private ArticuloTieneSolicitudId id;
     private Articulo articulo;
     private Solicitud solicitud;

    public ArticuloTieneSolicitud() {
    }

    public ArticuloTieneSolicitud(ArticuloTieneSolicitudId id, Articulo articulo, Solicitud solicitud) {
       this.id = id;
       this.articulo = articulo;
       this.solicitud = solicitud;
    }
   
    public ArticuloTieneSolicitudId getId() {
        return this.id;
    }
    
    public void setId(ArticuloTieneSolicitudId id) {
        this.id = id;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public Solicitud getSolicitud() {
        return this.solicitud;
    }
    
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }




}

