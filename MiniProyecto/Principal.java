package MiniProyecto;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Moto bajocc[] = new Moto[20];
        Moto altocc[] = new Moto[10];

        int opc = -1;
        String placa;
        double cilindraje;
        String marca;

        /*
         * bajocc[1]=null;
         * if (bajocc[1]==null) {
         * System.out.println("Está vacio...");
         * 
         * }
         */

        for (int c = 0; c < 20; c++) {
            bajocc[c] = null;
        }
        Scanner entrada = new Scanner(System.in);
        
        bajocc[0] = new Moto(placa, cilindraje, marca);
        System.out.println(bajocc[0].getPlaca());



            System.out.println("1. Registrar moto: ");
            System.out.println("2. Calcular cobro: ");
            System.out.println("3. Salir: ");

        do{
             
            System.out.println("1. Registrar moto: ");
            System.out.println("2. Calcular cobro: ");
            System.out.println("3. Salir: ");
            switch(opc){
                case 1: {System.out.println("Por favor ingrese la placa: ");

        placa = entrada.next();

        System.out.println("Por favor ingrese el cilindraje: ");

        cilindraje = entrada.nextDouble();

        System.out.println("Por favor ingrese la marca: ");

        marca = entrada.next();
}            
               
                case 2: {}

                case 3: {}

                default: {System.out.println("Está opción no es valida...");} break;
            
            int opcion = Scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese la placa: ");
                String placa = Scanner.nextLine;

                System.out.println("Ingrese el cilindraje: ");
                double cilindraje = Scanner.nextLine;

                System.out.println("Ingrese la marca: ");
                String marca = Scanner.nextLine;
            
            }
        }while ();

    }
}
