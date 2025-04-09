
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Inicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Primero creo el objeto de cliente donde ingreso el numero de cedula y nombre.
        Cliente cliente1 = new Cliente("1144183955", "Pedro Vasquez");
        // Creo la camara fotografica donde primero pongo el numero de serie, precio,
        // marca y modelo.
        Camara camarafotografica = new Camara(1234, 250000.00, "Canon", "2107");
        //

        int nroProductos = 2;
        LocalDate fechahoy = LocalDate.now(ZoneId.of("America/Bogota"));
        Pedido compra1 = new Pedido(cliente1, nroProductos, fechahoy, 91234);
        compra1.setProductos(camarafotografica);
        System.out.println("La fecha es: " + compra1.getFecha());
        Foto fotografias[] = new Foto[2];
        for (int i = 0; i < 2; i++) {
            String nombreFichero;
            System.out.println("Por favor ingrese el nombre del fichero N° " + (i + 1));
            nombreFichero = entrada.next();
            fotografias[i] = new Foto(nombreFichero);
        }
        for (int i = 0; i < 2; i++) {
            Impresion impresoras = new Impresion(fotografias, "Morado", 35000.00, 123);
            compra1.setProductos(impresoras);
        }
        Producto[] lista = compra1.getProducto();

        System.out.println("Prcio de la lista: " + lista[1].getPrecio());
    }
}