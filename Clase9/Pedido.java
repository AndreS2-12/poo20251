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
    public Pedido (Cliente cliente, int nroProductos, LocalDate fecha, int numeroTarjetaCredito){
        this.cliente=cliente;
        this.producto= new Producto [nroProductos];
        this.fecha=fecha;
        this.numeroTarjetaCredito=numeroTarjetaCredito;
        this.contador=0;
        this.nroProductos=nroProductos;
    }

    public Cliente getCliente(){
        return cliente; 
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProducto(){
        return producto;
    } //Setter es para ingresar, es el que permite ingresar los productos.
    public void setProductos(Producto producto) {          
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
        return salida;
    }
}
