import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ** capturar datos desde consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.println("ingrese su sueldo mensual: ");
        double sueldo = scanner.nextDouble();

        System.out.println("Su edad es: " + edad);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su sueldo mensual es: " + sueldo);

        // cerrar el scanner
        scanner.close();

        int resultado = sumar(5, 10);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}