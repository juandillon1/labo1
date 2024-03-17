import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        System.out.println("Triangulo completo");
        for (int i = 1; i < size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------");
        System.out.println("Triangulo normal");
        for (int i = size; i > 0; i--) {
            for (int j = size; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("*\n");
        }
        System.out.println("-----------");
        System.out.println("Triangulo invertido");
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}