import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         *
         * Obtener dos arreglos con los números pares e impares del arreglo A de 10 elementos.
         */

         // Generar el tamado aleatirio entre 5 y 15
         Random random = new Random();
         int [] a = new int[10];

         //Llenar el arreglo
         System.out.print("Arreglo original: ");
         for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50)+1;
            System.out.print(a[i]+" ");
         }
         System.out.print("\n");

        //Contadores pared e impares
        int contPares=0, contImpares=0;
        for (int num : a){
            if (num%2==0){
                contPares++;
            }else{
                contImpares++;
            }
        }

        //Arreglos para pares e impares
        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];

        //Llenar los arreglos de pares e impares
        int posPares=0, posImpares=0;
        for (int num: a){ 
            if(num%2==0){
                pares[posPares] = num;
            }else{
                impares[posImpares] = num;
            }
        }

        //Mostrar arreglos
        System.out.print("Números pares: ");
        for(int num : pares){
            System.out.print(num + " ");
        }
        System.out.print("\n");

        System.out.print("Números impares: ");
        for(int num : impares){
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
}
