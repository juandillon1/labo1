public class Personaje {
    private String nombre;
    private String apellido;
    private int edad;

    private int vida;

    public Personaje(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Personaje(String nombre, String apellido, int edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }

    public void saltar() {
        System.out.println("Estoy saltando");
    }


}
