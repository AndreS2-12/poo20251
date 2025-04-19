import java.util.ArrayList;

public class Impresion extends Producto {

    // Atributos
    private String color;
    private Foto foto;
    private ArrayList<Foto> listaFoto = new ArrayList<Foto>(); // Arreglo de fotos se declara como arreglo porque tendra x cantidad de productos.

    // Método
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Impresion(Foto foto, String color, int numero) {
        super(numero, 120000);   //Cuando se usa una subclase y el constructor de la clase padre necesita
        this.color = color;     // valores, tienes que pasárselos usando la palabra clave Super.
        this.listaFoto.add(foto);
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public String getColor() {
        return color;
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setColor(String color) {
        this.color = color;
    }

    public Foto getFotos() {
        return foto;
    }

    public void setFotos(Foto foto) {
        this.listaFoto.add(foto);
    }

    @Override 
    public double getValorTotal(){
        double vTotal = getPrecio() - (getPrecio()*0.10);
        return vTotal;
    }
    //sirve para devolver una representación en forma de texto del objeto. Es decir, 
    //cuando tú quieras ver el contenido de un objeto de forma entendible, usas este método.
    public String toString() {
        String salida = "";
        for (Foto f : listaFoto) {
            salida += " " + f.print() + "\n";
        }
        return salida += "Precio: {" + getValorTotal() + " }";
    }
}
