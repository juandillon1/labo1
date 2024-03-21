public class Main {
    public static void main(String[] args) {
        Orco o1 = new Orco("Juan", "Perez", 20, 10);
        o1.setVida(100);
        Arquero a1 = new Arquero("Legolas", "Suarez", 40);
        a1.setVida(100);

        /* o1.atacar(a1);
        System.out.println(o1.getNombre() + " atacó a " + a1.getNombre());
        System.out.println(a1.getNombre() + " tiene de vida: " + a1.getVida());
        a1.atacar(o1);
        System.out.println(a1.getNombre() + " atacó a " + o1.getNombre());
        System.out.println(o1.getNombre() + " tiene de vida: " + o1.getVida()); */

        Enano e1 = new Enano("Pepito", "Perez", 20);
        e1.setVida(100);
        System.out.println(o1.getNombre() + " tiene " + o1.getVida() + " de vida antes de ser atacado");
        e1.atacar(o1);
        System.out.println(o1.getNombre() + " fue atacado por " + e1.getNombre() + " y ahora tiene " + o1.getVida() + " de vida");

        /* Orco o1 = new Orco("Hulk", "Randolf", 50, "Fuerte", 500);
        System.out.println(o1.getNombre()); */
        /* Personaje p1 = new Personaje();
        Orco o1 = new Orco();
        Arquero a1 = new Arquero();

        p1.setNombre("Pedro");
        p1.setApellido("Perez");
        p1.setEdad(20);
        System.out.println("Hola! Soy " + p1.getNombre() + " " + p1.getApellido() + " y tengo " + p1.getEdad() + " años");
        p1.caminar();
        p1.saltar();

        o1.setNombre("Hulk");
        o1.saltar();
        o1.atacar();

        a1.setNombre("Robin");
        a1.setEdad(88);
        a1.setCantFlechas(10);
        System.out.println("Hola! Soy " + a1.getNombre() + " y tengo " + a1.getEdad() + " años, tengo " + a1.getCantFlechas() + " flechas");
        a1.tirarFlechas(5); */
    }
}