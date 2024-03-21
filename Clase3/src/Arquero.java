public class Arquero extends Personaje{
    int punteria;
    int habilidad;
    int cantFlechas;

    public Arquero(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Arquero(String nombre, String apellido, int edad, int punteria, int habilidad, int cantFlechas) {
        super(nombre, apellido, edad);
        this.punteria = punteria;
        this.habilidad = habilidad;
        this.cantFlechas = cantFlechas;
    }

    public void setCantFlechas(int cantFlechas) {
        this.cantFlechas = cantFlechas;
    }

    public int getCantFlechas() {
        return cantFlechas;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public void tirarFlechas(int cantidadDeFlechas) {
        System.out.println("Tirando: " + cantidadDeFlechas + " de flechas");
    }

    public void atacar(Personaje victima) {
        victima.setVida(victima.getVida() / 2);
    }
}
