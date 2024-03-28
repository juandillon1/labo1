public abstract class Guerrero {
    private String nombre;
    private int vida;
    private int fuerza;

    public Guerrero(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public abstract void caminar();
    public void mirar() {
        System.out.println("Estoy mirando");
    }
    public abstract void atacar(); // Es abstracta porque se diferencia de los demás

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
