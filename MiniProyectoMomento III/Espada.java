import java.util.Random;

public class Espada extends Arma {
    public Espada() {
        super("Espada");
    }

    public int calcularDanio() {
        return new Random().nextInt(11) + 20; // 20–30
    }
}
