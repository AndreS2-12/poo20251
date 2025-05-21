import java.util.Random;

// Clase base Personaje
public class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected final int MAX_DANO = 30;
    protected final int MIN_DANO = 10;
    protected Arma arma;

    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = arma;
    }

    // Método para atacar al oponente (general)
    public void atacar(Personaje oponente) {
        int dano = arma.calcularDanio();
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca con " + arma.getNombre() + " a " +
                oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    // Método para recibir daño
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verifica si está vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
