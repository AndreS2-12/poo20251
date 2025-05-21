import java.util.Random;

public class Ninja extends Personaje {
    public Ninja(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = arma.calcularDanio();
        boolean critico = rand.nextDouble() < 0.25; // 25% de probabilidad de golpe crítico

        if (critico) {
            dano *= 2;
            System.out.println(this.nombre + " lanza un ataque ninja CRÍTICO con " + arma.getNombre() + " a " +
                    oponente.getNombre() + " causando " + dano + " puntos de daño ⚡");
        } else {
            System.out.println(this.nombre + " ataca sigilosamente con " + arma.getNombre() + " a " +
                    oponente.getNombre() + " causando " + dano + " puntos de daño.");
        }

        oponente.recibirDano(dano);
    }
}
