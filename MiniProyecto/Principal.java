package MiniProyecto;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Moto bajocc[] = new Moto[20];
       // Moto altocc[] = new Moto[10];

        String placa;
        double cilindraje;
        String marca;
    
    /*    bajocc[1]=null;  
    if (bajocc[1]==null) {
        System.out.println("Está vacio...");
        
    }   */

    for (int c = 0; c < 20; c++){
        bajocc[c]=null;
    }
Scanner entrada = new Scanner(System.in);
System.out.println("Por favor ingrese la placa: ");

placa = entrada.next();

System.out.println("Por favor ingrese el cilindraje: ");

cilindraje = entrada.nextDouble();

System.out.println("Por favor ingrese la marca: ");

marca = entrada.next();

bajocc[0] = new Moto(placa, cilindraje, marca);
System.out.println(bajocc[0].getPlaca());

/* placa = JOptionPane.showInputDialog("Por favor ingrese la placa: ");
        cilindraje = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el cilindraje: "));
        marca = JOptionPane.showInputDialog("Por favor ingrese la marca: ");
        bajocc[0] = new Moto(placa, cilindraje, marca);
        System.out.println(bajocc[0].getPlaca());
    }*/
        
}
}
