import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerText = new Scanner(System.in);
        System.out.println("Ingrese nombre 1: ");
        String personaNombre = scannerText.nextLine();
        System.out.println("Ingrese edad 1: ");
        int edad1 = scannerText.nextInt();
        scannerText.nextLine();
        System.out.println("Ingrese nombre 2: ");
        String personaNombre2 = scannerText.nextLine();
        System.out.println("Ingrese edad 2: ");
        int edad2 = scannerText.nextInt();
        scannerText.nextLine();
        System.out.println("Ingrese marca auto: ");
        String marcaAuto = scannerText.nextLine();
        System.out.println("Ingrese modelo auto: ");
        String modeloAuto = scannerText.nextLine();
        System.out.println("Ingrese año del auto: ");
        int anio = scannerText.nextInt();

        Persona persona1 = new Persona(personaNombre, edad1);
        Persona persona2 = new Persona(personaNombre2, edad2);
        Auto auto1 = new Auto(marcaAuto, modeloAuto, anio);
        System.out.println("Persona 1: " + persona1.getNombre());
        System.out.println("Persona 2: " + persona2.getNombre());
        System.out.println("Auto: " + auto1.getMarca() + "-" + auto1.getModelo() + " del año: " + auto1.getAnio());
    }
}