import java.util.*;

public class Inicio {

    public static void main(String[] args) {
        //Primero creo el objeto de cliente donde ingreso el numero de cedula y nombre.
        Cliente cliente1= new Cliente("1144183955", "Pedro Vasquez");
        //Creo la camara fotografica donde primero pongo el numero de serie, precio, marca y modelo.
        Camara fotografia= new Camara(1234, 250000.00, "Canon", "2107" );
        //
        int nroProductos = 2;
        Date fechahoy= new  Date();
        Pedido compra1= new Pedido(cliente1, nroProductos, fechahoy, 91234);
        compra1.setProductos(fotografia);
        Foto fotografias[] = new Foto[1];
        fotografias[0]= new Foto("Mi primera foto"); 

        Impresion impresoras =  new Impresion(fotografias, "Morado", 35000.00, 123);
        impresoras.getFotos();
    }
}