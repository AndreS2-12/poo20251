public class Camara extends Producto{

    //Atributos
    private String marca;
    private String modelo;

    //Métodos
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Camara(int numero, String marca, String modelo) {
        super(numero, 2000000);   //Cuando se usa una subclase y el constructor de la clase padre necesita
        this.marca = marca;     // valores, tienes que pasárselos usando la palabra clave Super.
        this.modelo = modelo;
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //Sobre escritura de metodo.
    @Override 
    public double getValorTotal(){
        double vTotal = getPrecio() + (getPrecio()*0.05);
        return vTotal;
    }
    //Es útil para ver rápidamente qué contiene un objeto, sin necesidad de usar varios 
    //getters uno por uno. Así el resultado es más práctico y legible.
    public String toString(){
        return "Camara { Marca: "  + marca +
                        " \nModelo: " + modelo +
                        " \nPrecio Bruto: " +getPrecio() +
                        " \nPrecio Neto: " + getValorTotal() + " }";
    }
}
