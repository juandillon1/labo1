public class Orco extends Guerrero{
    public Orco(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }

    @Override
    public void caminar() {
        System.out.println("Caminando como un orco");
    }

    @Override
    public void atacar() {
        System.out.println("Estoy atacando con garras");
    }
}
