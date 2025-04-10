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
    public String print(){
        return "Foto { Fichero: "  + fichero +" }";
    }
}