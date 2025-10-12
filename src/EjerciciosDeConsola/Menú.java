package EjerciciosDeConsola;

import java.util.Scanner;

public class Menú {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al restaurante 'El Bodegón'");
        System.out.println("1 - Pizza Napolitana");
        System.out.println("2 - Hamburguesa Doble con Papas");
        System.out.println("3 - 24 Piezas de Sushi Variadas");
        System.out.println("4 - Ensalada César");
        System.out.print("Ingrese el número de la opción que desea: ");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Usted eligió la opción 1 (Pizza Napolitana).");
                break;
            case 2:
                System.out.println("Usted eligió la opción 2 (Hamburguesa Doble con Papas).");
                break;
            case 3:
                System.out.println("Usted eligió la opción 3 (24 Piezas de Sushi Variadas)");
                break;
            case 4:
                System.out.println("Usted eligió la opción 4 (Ensalada César).");
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción del menú.");

        }
        scanner.close();
    }
}
