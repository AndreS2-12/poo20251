import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Inicio {

    public static void main(String[] args) {
        // Atributos
        Scanner entrada = new Scanner(System.in);
        String nombre, cedula, marca, modelo, color = " ";
        int numero, opColor, numeroTarjetaCredito, idProducto, continuar = -1;
        Foto foto;
        Impresion pi = null;
        Camara canon = null;
        Cliente cliente = null;
        Pedido pedido = null;
        boolean verificador = false;
        boolean verificadorProducto = false;
        LocalDate fechahoy = LocalDate.now(ZoneId.of("America/Bogota"));
        int opc = -1;
        // Ciclo de repetición Haga mientras
        do {
            System.out.println(
                    "Que desea elejir: \n 1. Crear cliente. \n 2. Realizar pedido. \n 3. Facturación. \n 4. Salir.");
            opc = entrada.nextInt();

            switch (opc) {
                case 1: {
                    System.out.println("Por favor ingrese el nombre del cliente: ");
                    nombre = entrada.next();
                    System.out.println("Por favor ingrese el numero de cedula: ");
                    cedula = entrada.next();
                    cliente = new Cliente(cedula, nombre);
                    System.out.println("Se creo el cliente exitosamente.");
                    verificador = true;
                }
                    break;

                case 2: {
                    System.out.println("Recuerde que para realizar un pedido antes \n debe haber creado un cliente.");
                    System.out.println("Por favor ingrese la tarjeta de credito: ");
                    numeroTarjetaCredito = entrada.nextInt();
                    // usamos un verificador para aclarar si hay un cliente creado de lo contrario
                    // mostrara un mensaje de error
                    if (verificador) {
                        int op1 = -1;
                        String nombref = "";
                        System.out.println("Que producto dese comprar: \n1. Impresion. \n2. Camara.");
                        op1 = entrada.nextInt();
                        if (op1 == 1) {
                            System.out.println("Por favor ingrese el nombre del fichero: ");
                            nombref = entrada.next();
                            foto = new Foto(nombref);
                            System.out.println("Por favor elija: \n1. Color. \n2. Blanco y negro.");
                            opColor = entrada.nextInt();
                            if (opColor == 1) {
                                color = "Color";
                            } else if (opColor == 2) {
                                color = "Blanco y negro";
                            }
                            System.out.println("Por favor ingrese el ID del producto");
                            idProducto = entrada.nextInt();
                            // armamos un producto de tipo impresión fotográfica con sus características.
                            // se crea un objeto de tipo impresion llamado pi y el objeto se construye
                            // usando los datos que acabas de recoger
                            pi = new Impresion(foto, color, idProducto);
                            verificadorProducto = true;
                            pedido = new Pedido(cliente, pi, fechahoy, numeroTarjetaCredito);
                            System.out.println("Desea realizar otro pedido? \n1. Si \n2. No");
                            continuar = entrada.nextInt();
                            while (continuar != 2) {
                                System.out.println("Por favor ingrese el nombre del fichero: ");
                                nombref = entrada.next();
                                foto = new Foto(nombref);
                                System.out.println("Por favor elija: \n1. Color. \n2. Blanco y negro.");
                                opColor = entrada.nextInt();
                                if (opColor == 1) {
                                    color = "Color";
                                } else if (opColor == 2) {
                                    color = "Blanco y negro";
                                }
                                System.out.println("Por favor ingrese el ID del producto");
                                idProducto = entrada.nextInt();
                                // armamos un producto de tipo impresión fotográfica con sus características.
                                // se crea un objeto de tipo impresion llamado pi y el objeto se construye
                                // usando los datos que acabas de recoger
                                pi = new Impresion(foto, color, idProducto);
                                pedido.setProductos(pi);
                                System.out.println("Desea realizar otro pedido? \n1. Si \n2. No");
                                continuar = entrada.nextInt();
                            }

                        } else if (op1 == 2) {
                            System.out.println("Por favor ingrese el numero de la camara: ");
                            numero = entrada.nextInt();
                            System.out.println("Por favor ingrese la marca: ");
                            marca = entrada.next();
                            System.out.println("Por favor ingrese el modelo: ");
                            modelo = entrada.next();
                            // armamos un producto de tipo camara con sus características.
                            // se crea un objeto de tipo Camara llamado canon y el objeto se construye
                            // usando los datos que acabas de recoger
                            canon = new Camara(numero, marca, modelo);
                            verificadorProducto = true;

                            pedido = new Pedido(cliente, canon, fechahoy, numeroTarjetaCredito);
                            System.out.println("Desea realizar otro pedido? \n1. Si \n2. No");
                            continuar = entrada.nextInt();
                            while (continuar != 2) {
                                System.out.println("Por favor ingrese el numero de la camara: ");
                                numero = entrada.nextInt();
                                System.out.println("Por favor ingrese la marca: ");
                                marca = entrada.next();
                                System.out.println("Por favor ingrese el modelo: ");
                                modelo = entrada.next();
                                canon = new Camara(numero, marca, modelo);
                                pedido.setProductos(canon);
                                System.out.println("Desea realizar otro pedido? \n1. Si \n2. No");
                                continuar = entrada.nextInt();
                            }
                        }
                    } else {
                        System.out.println("Debe crear primero un cliente");
                    }
                }
                    break;

                case 3: {
                    if (verificadorProducto == true && verificador == true) {
                        System.out.println("Impresion de la factura: ");
                        System.out.println(pedido.toString());
                        verificador = false;
                        verificadorProducto = false;
                    } else {
                        System.out.println("Para crear la factura debe de existir el cliente y los productos");
                    }
                }
                    break;

                case 4: {
                    opc = 4;
                    System.out.println("Gracias por su visita.");
                }
                    break;
                default:
                    System.out.println("Está opción no existe. Por favor elija otra.");
                    break;
            }
        } while (opc != 4);

    }
}