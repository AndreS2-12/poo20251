public class Foto {

    // Atributos
    private String fichero;

    // Métedo
    //Contructor: que lo reconocemos porque tiene el mismo nombre que la clase y no tiene tipo de retorno.
    public Foto(String fichero) {
        this.fichero = fichero;
    }
    //Sirven para obtener el valor de un atributo (variable) privado de una clase.
    public String getFichero() {
        return fichero;
    }
    //Sirven para modificar o actualizar el valor de un atributo de una clase.
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
    //Cumple con la misma funcion del toString aqui se puso por la propuesta del documento
    public String print(){
        return "Foto { Fichero: "  + fichero +" }";
    }
}