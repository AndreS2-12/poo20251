class Mago extends Personaje {
    public Mago(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = arma.calcularDanio() + 5; // Mago hace más daño
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " lanza un hechizo con " + arma.getNombre() +
                " a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
