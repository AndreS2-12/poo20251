import java.util.Scanner;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje p1, Personaje p2) {
        this.jugador1 = p1;
        this.jugador2 = p2;
    }

    public void iniciarPelea() {
        System.out.println("\n¡Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println("\n🏆 " + jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("\n🏆 " + jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("Turno de " + atacante.getNombre());
        System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " puntos de vida.");

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Atacar");
        System.out.println("2. Tirar hechizo");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar Enter

        switch (opcion) {
            case 1:
                atacante.atacar(defensor);
                break;
            case 2:
                if (atacante instanceof Mago) {
                    ((Mago) atacante).atacar(defensor);
                } else {
                    System.out.println("¡" + atacante.getNombre() + " no es un mago! Se realiza un ataque normal.");
                    atacante.atacar(defensor);
                }
                break;
            default:
                System.out.println("Opción inválida. Se realizará un ataque normal.");
                atacante.atacar(defensor);
                break;
        }

        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
        System.out.println("Presiona Enter para continuar...");
        scanner.nextLine();
        System.out.println("--------------------------------------------------\n");
    }

    public static Personaje crearPersonaje(int tipo, String nombre, Arma arma) {
        if (tipo == 2) {
            return new Mago(nombre, arma);
        } else if (tipo == 3) {
            return new Ninja(nombre, arma);
        } else {
            return new Guerrero(nombre, arma);
        }
    }

    public static Arma elegirArma(Scanner scanner) {
        System.out.println("Elige un arma:");
        System.out.println("1. Espada");
        System.out.println("2. Daga");
        System.out.println("3. Varita");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1: return new Espada();
            case 2: return new Daga();
            case 3: return new Varita();
         
            default:
                System.out.println("Opción inválida. Se asigna Daga por defecto.");
                return new Daga();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Jugador 1
        System.out.print("Jugador 1 - Ingresa tu nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Jugador 1 - ¿Qué clase deseas?");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Ninja");
        System.out.print("Opción: ");
        int tipo1 = scanner.nextInt();
        scanner.nextLine();

        Arma arma1 = elegirArma(scanner);
        Personaje jugador1 = crearPersonaje(tipo1, nombre1, arma1);

        // Jugador 2
        System.out.print("Jugador 2 - Ingresa tu nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Jugador 2 - ¿Qué clase deseas?");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Ninja");
        System.out.print("Opción: ");
        int tipo2 = scanner.nextInt();
        scanner.nextLine();

        Arma arma2 = elegirArma(scanner);
        Personaje jugador2 = crearPersonaje(tipo2, nombre2, arma2);

        // Inicia la pelea
        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();

        scanner.close();
    }
}
