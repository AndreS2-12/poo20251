public class Foto {

    // Atributos
    private String fichero;

    // Métedo
    
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}