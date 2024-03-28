public class Arquero extends Guerrero {

    public Arquero(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }

    @Override
    public void caminar() {
        System.out.println("Caminando como un arquero");
    }

    @Override
    public void atacar() {
        System.out.println("Estoy tirando flechas!");
    }
}
