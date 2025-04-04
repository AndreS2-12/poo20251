package Clase8;

public class Cliente1 {

    private long cedula;
    private String nombre;

    public Cliente1 (long cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
    }

    public String toString() {
        return "Cliente { CC: " + cedula + "Nombre: " + nombre + "}";
    }

}
