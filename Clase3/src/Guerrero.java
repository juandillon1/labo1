public abstract class Guerrero extends Personaje {
    public Guerrero(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Guerrero(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    public abstract void atacar(Personaje victima);
}
