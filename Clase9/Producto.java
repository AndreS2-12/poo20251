public class Producto {
    
    //Atributos
    private int numero;
    private double precio;

    //Métodos
   //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Producto (int numero, double precio){
        this.numero=numero;
        this.precio=precio;
    }
     //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public int getNumero(){
        return numero;
    }
    //sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setNumero(int numero){ 
        this.numero = numero; 
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) { 
        this.precio = precio; 
    }
}
