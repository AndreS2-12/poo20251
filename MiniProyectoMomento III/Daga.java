import java.util.Random;

public class Daga extends Arma {
    public Daga() {
        super("Daga");
    }

    public int calcularDanio() {
        return new Random().nextInt(11) + 10; // 10–20
    }
}
