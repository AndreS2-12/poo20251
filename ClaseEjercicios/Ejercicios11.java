import java.util.Random;

class Ejercicios11 {

    public static void main(String[] args) {
        /*
         * Dado un arreglo A de N elementos, almacenar los elementos negativos, ceros y
         * positivos en arreglos diferentes.
         * 
         * Análisis: necesitamos crear el arreglo de tamaño aleatorio y generar números
         * alaetorios que sean almacenados en el arreglo. clasificar los elementos en 3
         * arreglos
         * según sean negativos, positivos o ceros.
         */

        // Generar el tamado aleatirio entre 5 y 15
        Random random = new Random();
        int n = random.nextInt(11) + 5;

        // Declarar el arreglo
        int[] a = new int[n];

        // Llenar el arreglo con numeros aleatorios
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(41) - 20;
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");

        // Contadores para los arreglos positivos(+), negativos(-) y ceros(0).
        int conNegativos = 0, conPositivos = 0, conCeros = 0;
        for (int num : a) {
            if (num < 0) {
                conNegativos++;
            } else if (num == 0) {
                conCeros++;
            } else {
                conPositivos++;
            }
        }
        // Creacion de arreglos para la cantidad
        int[] negativos = new int[conNegativos];
        int[] ceros = new int[conCeros];
        int[] positivos = new int[conPositivos];

        // Llenar arreglos con los numeros dados aleatoriamente
        int posNegativos = 0, posPositivos = 0, posCeros = 0;
        for (int num : a) {
            if (num < 0) {
                negativos[posNegativos++] = num;
            } else if (num == 0) {
                ceros[posCeros++] = num;
            } else {
                positivos[posPositivos++] = num;
            }
        }

        // Mostrar el arreglo de los negativos(-)
        System.out.println("Negativos: ");
        for (int num : negativos) {
            System.out.println(num + " ");
        }
        System.out.println();

        // Mostrar el arreglo de los positivos(-)
        System.out.println("Positivos: ");
        for (int num : positivos) {
            System.out.println(num + "");
        }
        System.out.println();

        // Mostrar el arreglo de los negativos(-)
        System.out.println("Ceros: ");
        for (int num : ceros) {
            System.out.println(num + "");
        }
        System.out.println();

    }
}