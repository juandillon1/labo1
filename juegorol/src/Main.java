public class Main {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero();
        g1.energia = 100;
        g1.fuerza = 10;
        g1.nombre = "superman";
        g1.vivo = true;
        g1.vida = 250;

        Guerrero g2 = new Guerrero();
        g2.energia = 100;
        g2.fuerza = 5;
        g2.nombre = "lex luthor";
        g2.vivo = true;
        g2.vida = 150;

        Mago m1 = new Mago();
        m1.energia = 100;
        m1.fuerza = 50;
        m1.nombre = "gandalf";
        m1.vivo = true;
        m1.vida = 300;
        m1.mana = 100;
        m1.escudo = 100;

        /* System.out.println("Soy " + g2.nombre + " y estoy atacando a " + g1.nombre);
        g2.atacar(g1);
        System.out.println(g1.nombre + " tiene vida: " + g1.vida);
        System.out.println("Soy " + g2.nombre + " y estoy curando a " + g1.nombre);
        g2.curar(g1, 50);
        System.out.println(g1.nombre + " tiene vida: " + g1.vida); */
        System.out.println(g2.nombre + " tiene " + g2.vida + " de vida");
        System.out.println(m1.nombre + " tiene " + m1.mana + " de mana");
        System.out.println(m1.nombre + " ataca a " + g2.nombre);
        m1.atacar(g2);
        System.out.println(g2.nombre + " ahora tiene " + g2.vida + " de vida");
        System.out.println(m1.nombre + " ahora tiene " + m1.mana + " de mana");

        System.out.println(m1.nombre + " siendo atacado por " + g2.nombre);
        g2.atacarMago(m1);
        System.out.println(m1.nombre + " se defiende con escudo actual en " + m1.escudo);
        m1.defender();
        System.out.println(m1.nombre + " le queda escudo actual en " + m1.escudo);
    }
}