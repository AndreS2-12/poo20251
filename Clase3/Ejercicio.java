public class Ejercicio {
   public static void main(String[] args) {
        /*
         * 3. dado un arreglo lineal de numeros, sumar separadamente
         * los numeros pares y los impares.
         * 
         * Analisis: Declarar un arreglo, en dos variables guardar la suma
         * de los pares y los impares, lo anterior debe iterar en un "for"
         * con la condición de validar si el numero es par o impar (n%2==0 -> par)
         */

         int [] arreglo = {5, 2, 6, 5, 90, 9, 1, 8, 15, 4};
         int sumaPares = 0, sumaImpares = 0;

         for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]%2==0){
            sumaPares += arreglo[i];
         } else {
            sumaImpares += arreglo[i];
         }  
      }
      System.out.println("La suma de los pares es: " + sumaPares);
      System.out.println("la suma de los impares es: " + sumaImpares);
   }
}