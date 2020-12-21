package Modelo;
// Generated 18-dic-2020 16:35:14 by Hibernate Tools 3.6.0



/**
 * PrestamoId generated by hbm2java
 */
public class PrestamoId  implements java.io.Serializable {


     private int id;
     private int solicitudClientePersonaId;

    public PrestamoId() {
    }

    public PrestamoId(int id, int solicitudClientePersonaId) {
       this.id = id;
       this.solicitudClientePersonaId = solicitudClientePersonaId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getSolicitudClientePersonaId() {
        return this.solicitudClientePersonaId;
    }
    
    public void setSolicitudClientePersonaId(int solicitudClientePersonaId) {
        this.solicitudClientePersonaId = solicitudClientePersonaId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PrestamoId) ) return false;
		 PrestamoId castOther = ( PrestamoId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getSolicitudClientePersonaId()==castOther.getSolicitudClientePersonaId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getSolicitudClientePersonaId();
         return result;
   }   


}


