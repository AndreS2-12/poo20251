import java.util.Random;

public class Varita extends Arma {
    public Varita() {
        super("Varita mágica");
    }

    public int calcularDanio() {
        return new Random().nextInt(11) + 15; // 15–25
    }
}
