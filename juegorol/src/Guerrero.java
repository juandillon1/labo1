public class Guerrero {
    int vida;
    int energia;
    String nombre;
    int fuerza;
    boolean vivo;

    public void atacar(Guerrero victima) {
        victima.vida -= this.fuerza;
    }

    public void atacarMago(Mago victima) {
        victima.vida -= this.fuerza;
    }
    public void defender() {
        System.out.println("Me estoy defendiendo");
    }
    public void curar(Guerrero guerrero, int vida) {
        guerrero.vida += vida;
    }
    public void morir() {
        System.out.println("Estoy muerto");
    }

}
