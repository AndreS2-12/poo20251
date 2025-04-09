public class Camara extends Producto{

    //Atributos
    private String marca;
    private String modelo;
    //private double resolucion;

    //Métodos
    public Camara(int numero, double precio, String marca, String modelo) {
        super(numero, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
