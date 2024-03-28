public class Hechicero extends Guerrero{

    public Hechicero(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }

    public void caminar() {
        System.out.println("Caminando como un hechicero");
    }
    @Override
    public void atacar() {
        System.out.println("Estoy tirando hechizos");
    }
}
