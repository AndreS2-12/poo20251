import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
         * Se tienen los nombres y sueldos de los trabajadores de una empresa
         * se desea saber cuántos y quiénes tienen un sueldo promedio.+
         * 
         * Análisis: Inicalmente debemos saber cuantos trabajadores vamos a requerir
         * para hacer el
         * promedio pedido, pedir nombres y salarios de los trabajores, cualcular el
         * sueldo promedio
         * identificar quienes lo tienen y mostrar la cantidad y nombres de los
         * trabajadores
         */

        Scanner scanner = new Scanner(System.in);

        // Solicitar cantidad de trabajadores
        System.out.println("Ingrese la cantidad de trabajadores: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Declarar arreglos
        String[] nombres = new String[n];
        double[] salarios = new double[n];

        // Ingresar los datos
        double sumaSalarios = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del trabajador: " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese el sueldo de " + nombres[i] + ": ");
            salarios[i] = scanner.nextDouble();
            scanner.nextLine();

            sumaSalarios += salarios[i];
        }
        // Calcular sueldo promedio
        double salarioPromedio = sumaSalarios / n;
        System.out.println("\nEl salario primedio es: " + salarioPromedio);

        //Contar y mostrar trabajadores con el salario promedio
        System.out.println("\nTrabajadores con salario promedio: ");
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (salarios[i] == salarioPromedio){
                System.out.println(nombres[i]);
                cont++;
            }
        }
        System.out.println("\nTotal de trabajadores con sueldo promedio: "+cont);
    }
}
