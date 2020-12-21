package Modelo;
// Generated 18-dic-2020 16:35:14 by Hibernate Tools 3.6.0



/**
 * ArticuloTieneSolicitudId generated by hbm2java
 */
public class ArticuloTieneSolicitudId  implements java.io.Serializable {


     private int solicitudId;
     private int articuloId;

    public ArticuloTieneSolicitudId() {
    }

    public ArticuloTieneSolicitudId(int solicitudId, int articuloId) {
       this.solicitudId = solicitudId;
       this.articuloId = articuloId;
    }
   
    public int getSolicitudId() {
        return this.solicitudId;
    }
    
    public void setSolicitudId(int solicitudId) {
        this.solicitudId = solicitudId;
    }
    public int getArticuloId() {
        return this.articuloId;
    }
    
    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArticuloTieneSolicitudId) ) return false;
		 ArticuloTieneSolicitudId castOther = ( ArticuloTieneSolicitudId ) other; 
         
		 return (this.getSolicitudId()==castOther.getSolicitudId())
 && (this.getArticuloId()==castOther.getArticuloId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSolicitudId();
         result = 37 * result + this.getArticuloId();
         return result;
   }   


}


