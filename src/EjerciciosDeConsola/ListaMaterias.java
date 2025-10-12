package EjerciciosDeConsola;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaMaterias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> materias = new ArrayList<>();

        System.out.print("¿Cuántas materias querés ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i<cantidad; i++){
            System.out.print("Ingrese el nombre de la materia " + (i + 1) + ": ");
            String materia = scanner.nextLine().toUpperCase();
            materias.add(materia);
        }
        System.out.println("\nMaterias del cuatrimestre:");
        for (String materia : materias) {
            System.out.println(materia);
        }

        System.out.print("\nIngrese el nombre de una materia a eliminar: ");
        String eliminar = scanner.nextLine().toUpperCase();

        if (materias.remove(eliminar)) {
            System.out.println("Materia eliminada correctamente.");
        } else {
            System.out.println("La materia no fue encontrada.");
        }

        System.out.println("\nMaterias actuales:");
        System.out.println(materias);

        scanner.close();
    }
}
