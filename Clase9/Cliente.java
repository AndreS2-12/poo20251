public class Cliente {
    
    //Atributos
    private String cedula;
    private String nombre;

    //Metodos
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Cliente(  String cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public String getCedula() {
        return cedula;
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setCedula(String cedula) { 
        this.cedula = cedula; 
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
         this.nombre = nombre; 
    }

    //sirve para devolver una representación en forma de texto del objeto. Es decir, 
    //cuando tú quieras ver el contenido de un objeto de forma entendible, usas este método.
    public String toString(){
        return "Cliente { Cedula: "  + cedula +
                        "Nombre: " + nombre + " }";
    }
}