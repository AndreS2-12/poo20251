package Clase4;

public class Ejecutar {
    public static void main(String[] args) {
        //Creacion de los objetos de la clase Vehiculos
        //Forma1
        Vehiculo objVehiculo = new Vehiculo("Toyota", "Blanco", 4500.0, "TE3RE53", "2.3", "150HP");

        //Forma2
        Vehiculo oibjVehiculo2;
        objVehiculo = new ("Ferrari", "Rojo", 5000.0, "SW245REDE3", 1.8, "450HP");

        //Mostrar la marca del objeto vehiculo
        System.out.println(objVehiculo.getMarca());

        //Se va a modificar la marca del vehiculo del objeto objVehiculo
        objVehiculo.setMarca("Chevrolet");

        //Mostrar todo el objeto
        System.out.println(objVehiculo.toString());
        System.out.println(oibjVehiculo2);
    }
}
