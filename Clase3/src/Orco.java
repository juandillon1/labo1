public class Orco extends Personaje{

    private String tipoGrito;
    private int fuerza;

    public Orco(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Orco(String nombre, String apellido, int edad, String tipoGrito, int fuerza) {
        super(nombre, apellido, edad);
        this.tipoGrito = tipoGrito;
        this.fuerza = fuerza;
    }

    public String getTipoGrito() {
        return tipoGrito;
    }

    public void setTipoGrito(String tipoGrito) {
        this.tipoGrito = tipoGrito;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }


    public void atacar() {
        System.out.println("GRRRR... Estoy atacando");
    }
}
