package MiniProyecto;

public class Moto {
    private String placa;
    private double cilindraje;
    private String marca;
    private int tiempoParcadero;

    public Moto(String placa, double cilindraje, String marca) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public int getTiempoParcadero() {
        return tiempoParcadero;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCilindraje(Double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTiempoParcadero(int tiempoParcadero) {
        this.tiempoParcadero = tiempoParcadero;
    }
}
