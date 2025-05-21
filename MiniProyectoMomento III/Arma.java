public abstract class Arma {
    protected String nombre;

    public Arma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int calcularDanio();
}
