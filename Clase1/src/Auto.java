public class Auto {
    private final String marca;
    private final String modelo;
    private final int anio;
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }
}
