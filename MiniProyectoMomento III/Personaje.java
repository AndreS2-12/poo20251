import java.util.Random;

// Clase base: Personaje
class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected final int MAX_DANO = 30;
    protected final int MIN_DANO = 10;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Todos inician con 100 HP
    }

    // Método para atacar al oponente
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    // Método para recibir daño
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Retorna el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Retorna los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}

// Subclase Guerrero
class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }
}

// Subclase Mago
class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }

    // El mago hace un poco más de daño
    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + 5;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " lanza un hechizo a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}