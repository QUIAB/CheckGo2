
//Dao
import Controlador.DaoCliente;
import Controlador.DaoPersona;
import Controlador.DaoPersonal;
//Modelos
import Modelo.Cliente;
import Modelo.EstadoPersonal;
import Modelo.Persona;
import Modelo.Personal;
//operaciones de Test
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


/**
 *
 * @author IVEG
 */

//Test del modulo del Personal
public class TestDaoModulo {
    //clinte para insertary eliminar
    Cliente cln;
    //Persona que se insertara y servira para tabla 
    Persona per;
    Persona P3;
    //Servira para agregar un personal nuevo
    EstadoPersonal Est;
    //personal que se insertara y luego se eliminara
    Personal p1;
    
    @Before
    public void inicializador(){
       per = new Persona (12,"Ivan","Eduardo","Quiab","Aznar");
       cln = new Cliente(1,per,"prueba@uacam.mx",10,12);
       Est = new EstadoPersonal(25,"Activo");
       p1 = new Personal (10,Est,per,"102035");
    }
    
    //Se inserta un cliente pero este se relaciona con persona por su id
    //Tabla Cliente
    @Test
    public void TestDao() {
      DaoCliente ClD = new DaoCliente();
      Assert.assertEquals("Exito",ClD.Insertar(cln));
    }
    
    
    //se insetar nuevo persona
    //Tabla Persona
    @Test
    public void getTestDao2(){
        Persona per2 = new Persona(13,"Pancho","Jesus","Martinez","Perez");
        DaoPersona p = new DaoPersona();
        Assert.assertEquals("Exito",p.Insertar(per2));
    }
    
    //Prueba de Eliminar Cliente
    //Tabla Cliente
    @Test
    public void TestDAo3(){
      DaoCliente Dc = new DaoCliente();
      Assert.assertEquals("Exito",Dc.Eliminar(cln));
    }
    
    //Eliminar una persona
    //Tabla persona
    @Test
    public void TestDAo4(){
        Persona P2 = new Persona(13,"Pancho","Jesus","Martinez","Perez");
        DaoPersona Dp = new DaoPersona();
        Assert.assertEquals("Exito",Dp.Eliminar(P2));
    }
    
    //Actualizar datos nombre
    //Tabla persona
    @Test
    public void TestDAo5(){
       P3 = new Persona (14,"Pedro","Manuel","Sanchez","Medina");
       DaoPersona DaoP3= new DaoPersona();
       DaoP3.Insertar(P3);
       P3.setNombre("Miguel");
       Assert.assertEquals("Exito",DaoP3.actualizar(P3));
    }
    //Insertar personal
    //Tabla personal
    @Test
    public void TestDAo6(){
        DaoPersonal PersonalN = new DaoPersonal();
        Assert.assertEquals("Exito",PersonalN.Insertar(p1));
        
    }
    //Eliminar Personal
    //Tabla personal
    @Test
    public void TestDAo7(){
        DaoPersonal Dper = new DaoPersonal();
        Assert.assertEquals("Exito",Dper.Eliminar(p1));
    }  
}
