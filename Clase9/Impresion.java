import java.util.List;

public class Impresion extends Producto {

    // Atributos
    private String color;
    private Foto[] foto; // Arreglo de fotos se declara como arreglo porque tendra x cantidad de productos.

    // Método
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Impresion(Foto[] foto, String color, double precio, int numero) {
        super(numero, precio);   //Cuando se usa una subclase y el constructor de la clase padre necesita
        this.color = color;     // valores, tienes que pasárselos usando la palabra clave Super.
        this.foto = foto;
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public String getColor() {
        return color;
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFotos() {
        return foto;
    }

    public void setFotos(Foto[] foto) {
        this.foto = foto;
    }
    //sirve para devolver una representación en forma de texto del objeto. Es decir, 
    //cuando tú quieras ver el contenido de un objeto de forma entendible, usas este método.
    public String toString() {
        String salida = "";
        //se hace el for porque el atributo foto es un arreglo de fotos (Foto[] foto).
        //Entonces, como no es solo una foto, sino varias, se necesita recorrerlas una por una.
        for (int x = 0; x < getFotos().length; x++) {
            salida += "" + getFotos()[x].print() + "\n";
        }
        return salida;
    }
}
