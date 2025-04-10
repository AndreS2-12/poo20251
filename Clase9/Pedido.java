import java.time.LocalDate;
import java.util.*;

public class Pedido{
    
    //Atributos
    private Cliente cliente;
    private Producto[] producto;
    private LocalDate fecha;
    private int numeroTarjetaCredito; 
    private int nroProductos;
    Scanner entrada = new Scanner(System.in);
    private int contador;
    //Métodos
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Pedido (Cliente cliente, int nroProductos, LocalDate fecha, int numeroTarjetaCredito){
        this.cliente=cliente;
        this.producto= new Producto [nroProductos];
        this.fecha=fecha;
        this.numeroTarjetaCredito=numeroTarjetaCredito;
        this.contador=0;
        this.nroProductos=nroProductos;
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public Cliente getCliente(){
        return cliente; 
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProducto(){
        return producto;
    } //Setter es para ingresar, es el que permite ingresar los productos.
    public void setProductos(Producto producto) {  
        //cuando se creó el pedido, ya se definió cuántos productos puede tener como máximo (con nroProductos).        
        if (contador < nroProductos){
                this.producto[contador] = producto;
            contador++;
        }else {
            System.out.println("Llego al maximo de productos.");
        }
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
    public String toString(){
        String salida="Pedido { Cliente: "  + cliente.toString() +
                        "producto: ";
                        for (int x = 0; x < getProducto().length; x++) {
                            salida += " " + getProducto()[x].toString() + "\n";
                        }
                        salida+="}";
                        salida+= "Fecha: \n"+fecha;
                        salida+= "TC: \n"+numeroTarjetaCredito;
        return salida;
    }
}
