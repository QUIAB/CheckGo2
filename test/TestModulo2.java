
//Dao
import Controlador.DaoArticulo;
import Controlador.DaoTipo_Articulo;
//Modelos
import Modelo.TipoArticulo;
import Modelo.Articulo;

//operaciones de Test
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author IVEG
 */

//Test del modulo del Inventario
public class TestModulo2 {

    TipoArticulo artiN;
    TipoArticulo artiN2;
    TipoArticulo artiN3;
    TipoArticulo artiN4;
    Articulo art1;
    Articulo art2;
    
    @Before
    public void inicializador() {
        artiN = new TipoArticulo(120, "Computadora");
        artiN2 = new TipoArticulo(112, "Impresora");
        artiN3 = new TipoArticulo(130, "Laptop");
    }

    //Insertat un tipo de articulo
    //tabla tipo_articulo
    @Test
    public void TestModuloInventario(){
        DaoTipo_Articulo tipo1 = new DaoTipo_Articulo();
        Assert.assertEquals("Exito",tipo1.Insertar(artiN));
    }
//    Eliminar un tipo de articulo
//    tabla tipo_articulo
    @Test
    public void TestModuloInventario2() {
        DaoTipo_Articulo tipo1 = new DaoTipo_Articulo();
        Assert.assertEquals("Exito", tipo1.Eliminar(artiN));
    }
    
//    Insertar Y actualizar tipo de articulo
//    tabla tipo_articulo
    @Test
    public void TestModuloInventario3() {
        //artiN2;
        DaoTipo_Articulo tipo1 = new DaoTipo_Articulo();
        tipo1.Insertar(artiN2);
        artiN2.setNombre("Scanner");
        Assert.assertEquals("Exito", tipo1.actualizar(artiN2));
    }
    //Insertar 
    //tabla articulo
    @Test
    public void TestModuloInventario4() {
        DaoArticulo tipo1 = new DaoArticulo();
        art1 = new Articulo (125,artiN3,"1200");
        Assert.assertEquals("Exito", tipo1.Insertar(art1));
    }
    
    //Eliminar 
    //tabla articulo
    @Test
    public void TestModuloInventario5() {
        DaoArticulo tipo1 = new DaoArticulo();
        art1 = new Articulo (125,artiN3,"1200");
        Assert.assertEquals("Exito", tipo1.Eliminar(art1));
    }
    
    //Insertar y actualizar 
    //tabla articulo
    @Test
    public void TestModuloInventario6() {
        DaoArticulo tipo1 = new DaoArticulo();
        art1 = new Articulo (125,artiN3,"1200");
        tipo1.Insertar(art1);
        art1.setCodigo("1300");
        Assert.assertEquals("Exito", tipo1.actualizar(art1));
    }
    
    //Insertar un tipo de articulo y un articulo
    //tabla articulo
    @Test
    public void TestModuloInventario7() {
        //TipoArticulo artiN4;
        artiN4 = new TipoArticulo(30,"Laptop");
        DaoTipo_Articulo tipo1 = new DaoTipo_Articulo();
        tipo1.Insertar(artiN4);
        //Articulo art2;
        art2 = new Articulo(126, artiN4, "1500");
        DaoArticulo tipo2 = new DaoArticulo();
        Assert.assertEquals("Exito", tipo2.Insertar(art2));
    }

}
