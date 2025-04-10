import java.util.List;

public class Impresion extends Producto {

    // Atributos
    private String color;
    private Foto[] foto; // Arreglo de fotos.

    // Método
    public Impresion(Foto[] foto, String color, double precio, int numero) {
        super(numero, precio);
        this.color = color;
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFotos() {
        return foto;
    }

    public void setFotos(Foto[] foto) {
        this.foto = foto;
    }

    public String toString() {
        String salida = "";

        for (int x = 0; x < getFotos().length; x++) {
            salida += "" + getFotos()[x].print() + "\n";
        }
        return salida;
    }
}
