package MiniProyecto;

import java.util.Scanner;

public class Principal {
    // Funciones para alto y bajo "cc": la funcion recibe como parametro un arreglo
    // de objetos.
    public static void parcaderoBcc(Moto b[]) {

        // Creamos el encabezado y espacios del parcadero inicializandolo con un String.
        String vistaParcaderoBcc = "                                                                        PARCADERO DE BAJO CILINDRAJE                                                           \n";
        vistaParcaderoBcc += "   1        2        3       4       5       6       7       8       9       10     11      12      13      14      15      16      17      18      19      20     \n";

        // Hacer que el metodo recorra el array de objetos "Moto" que refleja los
        // espacios del parcadero.
        // bajocc.length es la cantidad de espacios total en el parcadero.
        // indice = será la posicion del array.
        // dentro del ciclo se verificara cada espacio que este vacio o ocupado.
        for (int indice = 0; indice < b.length; indice++) {
            if (b[indice] == null) {
                vistaParcaderoBcc += "[Vacio] ";
            } else {
                vistaParcaderoBcc += "[Ocupado] ";
            }
        }
        System.out.println(vistaParcaderoBcc);
    }

    public static void parcaderoAcc(Moto a[]) {
        String vistaParcaderoAcc = "                             PARCADERO DE ALTO CILINDRAJE                     \n";
        vistaParcaderoAcc += "    1        2       3       4       5       6       7       8       9       10     \n";
        for (int indice = 0; indice < a.length; indice++) {
            if (a[indice] == null) {
                vistaParcaderoAcc += "[Vacio] ";
            } else {
                vistaParcaderoAcc += "[Ocupado] ";
            }
        }
        System.out.println(vistaParcaderoAcc);
    }

    // parametros de entrada de la función.
    public static void CalcularCobro(int tiempoInicio, int tiempoFin) {
        String impresion = "Factura ParkingNow\n";
        int tiempoEstadia = 0;
        tiempoEstadia = tiempoFin - tiempoInicio;
        if (tiempoEstadia > 0 && tiempoEstadia < 30) {
            impresion += "No debe pagar. \n gracias por su visita.";
        } else if (tiempoEstadia > 30 && tiempoEstadia < 61) {
            impresion += "El costo que debe pagar es de: $800. \nGracias por su visita.";
        } else if (tiempoEstadia > 60) {
            impresion += "El costo que debe pagar es de: $2000. \nGracias por su visita.";
        }
        System.out.println(impresion);
    }

    public static void main(String[] args) {
        Moto bajocc[] = new Moto[20];
        Moto altocc[] = new Moto[10];

        // Buena praxys inicializar las variables.
        int opc = -1;
        String placa = "";
        double cilindraje = 0;
        String marca = "";
        int horaIngreso = 0;

        for (int indice = 0; indice < bajocc.length; indice++) {
            bajocc[indice] = null;
        }

        for (int indice = 0; indice < altocc.length; indice++) {
            altocc[indice] = null;
        }

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("  Menu Principal ");
            System.out.println("1. Registrar moto: ");
            System.out.println("2. Calcular cobro: ");
            System.out.println("3. Salir: ");
            System.out.println("Seleccione una Opción: ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Por favor ingrese los datos & elija el numero de parqueo: ");
                    System.out.println("Por favor ingrese la placa: ");
                    placa = entrada.next();
                    System.out.println("Por favor ingrese el cilindraje: ");
                    cilindraje = entrada.nextDouble();
                    System.out.println("Por favor ingrese la marca: ");
                    marca = entrada.next();
                    System.out.println("Digite la hora de ingreso (Hora militar): ");
                    horaIngreso = entrada.nextInt();
                    if (horaIngreso >659 && horaIngreso <2200) 
                    {
                            if (cilindraje > 0 && cilindraje <= 400) {
                                parcaderoBcc(bajocc);
                                System.out.println("Por favor elija un puesto de parqueo: ");
                                int puesto = entrada.nextInt();
                                if (puesto > 0 && puesto < 20) {
                                    if (bajocc[puesto - 1] == null) {
                                        bajocc[puesto - 1] = new Moto(placa, cilindraje, marca, horaIngreso);
                                        parcaderoBcc(bajocc);
                                    } else {
                                        System.out.println("El puesto esta ocupado");
                                    }
                                }
                            }
                            if (cilindraje >= 401 && cilindraje <= 2500) {
                                parcaderoAcc(altocc);
                                System.out.println("Por favor elija un puesto de parqueo: ");
                                int puesto = entrada.nextInt();
                                if (puesto > 0 && puesto < 11) {
                                    if (altocc[puesto - 1] == null) {
                                        altocc[puesto - 1] = new Moto(placa, cilindraje, marca, horaIngreso);
                                        parcaderoAcc(altocc);
                                    } else {
                                        System.out.println("El puesto esta ocupado");
                                    }
                                }
                            }
                            if (cilindraje < 0 && cilindraje > 2500) {
                                System.out.println("El cilindraje no existe.");
                            }
                    }
                }
                    break;
                case 2: {
                    System.out.println(
                            "Por elija si la moto es de alto cilindraje: \n1. Bajo Cilindraje. \n2. Alto cilindraje.");
                    int cc = entrada.nextInt();
                    if (cc == 1) 
                    {
                                        System.out.println("Por ingrese el puesto: ");
                                        int puesto = 0;
                                        puesto = entrada.nextInt();
                                        // como el obejto ya esta creado, se esta trayendo el atributo cilindraje para
                                        // generar la factura.
                                        if (puesto > 0 && puesto <= 20)
                                        {
                                            if (bajocc[puesto - 1] != null) 
                                            {
                                                if (bajocc[puesto - 1].getCilindraje() > 0
                                                        && bajocc[puesto - 1].getCilindraje() < 400) 
                                                {
                                                            System.out.println("Digite la hora de salida (Hora militar):");
                                                            int horaSalida = entrada.nextInt();
                                                            // se llama la funcion con la hora que se ingresa la moto y la hora de salida de
                                                            // la moto
                                                            // para hacer el calculo de la factura.
                                                            CalcularCobro(bajocc[puesto - 1].getHoraIngreso(), horaSalida);
                                                            bajocc[puesto-1]=null;
                                                } else {
                                                    System.out.println("El puesto no existe.");
                                                }
                                            } else 
                                                {
                                                        System.out.println("No hay moto en este puesto.");
                                                }
                                        }

                    } else if (cc == 2) 
                    {
                            System.out.println("Por ingrese el puesto: ");
                            int puestoc = 0;
                            puestoc = entrada.nextInt();
                            // como el obejto ya esta creado, se esta trayendo el atributo cilindraje para
                            // generar la factura.
                            if (puestoc > 0 && puestoc <= 10) 
                            {
                                                if (altocc[puestoc - 1] != null) 
                                                {
                                                    if (altocc[puestoc - 1].getCilindraje() > 400
                                                            && altocc[puestoc - 1].getCilindraje() < 2500) 
                                                    {
                                                        System.out.println("Digite la hora de salida (Hora militar):");
                                                        int horaSalida = entrada.nextInt();
                                                        // se llama la funcion con la hora que se ingresa la moto y la hora de salida de
                                                        // la moto
                                                        // para hacer el calculo de la factura.
                                                        CalcularCobro(altocc[puestoc - 1].getHoraIngreso(), horaSalida);
                                                        altocc[puestoc-1]=null;
                                                     } else {
                                                                System.out.println("El puesto no existe.");
                                                            }   
                                                    } else {
                                                            System.out.println("No hay moto en este puesto.");
                                                        }
                            }
                    }
                 if (cc <1 || cc >2) {
                    System.out.println("La opción de cilindraje no existe.");
                 }   
                }break;
                case 3: {
                    opc = 3;
                }
                    break;
                default: {
                    System.out.println("Está opción no es valida...");
                }
                    break;
            }
        } while (opc != 3);

    }
}