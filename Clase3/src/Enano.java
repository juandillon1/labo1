public class Enano extends Guerrero {
    private int cantidadOro;
    public Enano(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Enano(String nombre, String apellido, int edad, int cantidadOro) {
        super(nombre, apellido, edad);
        this.cantidadOro = cantidadOro;
    }

    public int getCantidadOro() {
        return cantidadOro;
    }

    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

    public void atacar(Personaje victima) {
        victima.setVida(victima.getVida() * 0.75);
    }

}
