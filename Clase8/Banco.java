package Clase8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Banco {
    
    private String nombre;
    private String direccion;
    //private Cuenta cuenta;
    private Cuenta[] cuenta; //Arreglo

    public Banco(String nombre, String direccion, Cuenta[] cuenta) {
        this.nombre=nombre;
        this.direccion=direccion;
        this.cuenta=cuenta;
    } 
    public String consultarCliente(Cliente1 cliente){
        return cliente.toString();
    }

    public String toString(){
        return "Banco {Nombre: " + nombre + 
                    "Dirección: " + direccion + 
                " " + Arrays.toString(cuenta)+ "}";
    }
}
