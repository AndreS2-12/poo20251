import java.time.LocalDate;
import java.util.*;

public class Pedido{
    
    //Atributos
    private Cliente cliente;
    private ArrayList<Producto> listaProductos= new ArrayList<Producto>(); //Arreglo para ingresar productos
    private LocalDate fecha;
    private int numeroTarjetaCredito; 
    private Producto producto;
    
    //Métodos
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Pedido (Cliente cliente, Producto producto, LocalDate fecha, int numeroTarjetaCredito){
        this.cliente=cliente;
        this.listaProductos.add(producto); //add sigfinica que estoy agregando un elemento al arreglo, es propio del arraylist
        this.fecha=fecha;
        this.numeroTarjetaCredito=numeroTarjetaCredito;              
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public Cliente getCliente(){
        return cliente; 
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto(){
        return producto;
    } //Setter es para ingresar, es el que permite ingresar los productos.
    public void setProductos(Producto producto) {  
        this.listaProductos.add(producto);
    }

    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjetaCredito(){
        return numeroTarjetaCredito;
    }
    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    public String toString(){ int valorTotal = 0;
        String salida="Pedido: "  + cliente.toString() +
                        " Producto: ";
                        for (Producto p : listaProductos) {
                            salida += " " + p.toString() + "\n";
                            valorTotal += p.getValorTotal();
                        }
                        salida+= "Fecha: " + fecha;
                        salida+= "\nTarjate de Credito: " + numeroTarjetaCredito;
                        salida+="\nValor total de la compra es: " + valorTotal;
        return salida;
    }
}
