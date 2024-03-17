public class Manzana {
    private int peso;
    private String color;
    private int tamanio;

    private boolean estado; // true esta bien - false esta podrida
    public void pudrir() {
        setEstado(false);
    }

    public void revivir() {
        setEstado(true);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public String isEstado() {
        return (this.estado) ? "No esta podrida" : "Esta podrida";
    }
}
