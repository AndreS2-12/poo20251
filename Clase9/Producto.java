public class Producto {
    
    //Atributos
    private int numero;
    private double precio;
    //private double resolucion; double resolucion

    //Métodos
    public Producto (int numero, double precio){
        this.numero=numero;
        this.precio=precio;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){ 
        this.numero = numero; 
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) { 
        this.precio = precio; 
    }

    //public double getResolucion(){
    //    return resolucion;
    //}
}
