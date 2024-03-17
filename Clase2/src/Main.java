public class Main {
    public static void main(String[] args) {
        Manzana manzana = new Manzana();
        manzana.setEstado(true);
        manzana.pudrir();
        manzana.revivir();
        System.out.println(manzana.isEstado());
    }
}