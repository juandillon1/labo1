public class Mago {
    int vida;
    int energia;
    String nombre;
    int fuerza;
    boolean vivo;

    int mana;
    int escudo;

    public void atacar(Guerrero victima) {
        victima.vida -= this.fuerza;
        this.mana -= 50;
    }
    public void defender() {
        this.escudo -= 50;
    }
    public void curar(Guerrero guerrero, int vida) {
        guerrero.vida += vida;
    }
    public void morir() {
        System.out.println("Estoy muerto");
    }

}
