package EjerciciosDeConsola;

import java.util.ArrayList;
import java.util.Scanner;

public class DiasDeLaWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> dias = new ArrayList<>();

        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");

        System.out.print("¿Cuántas veces desea mostrar los días de la semana? ");
        int repeticiones = scan.nextInt();

        for (int r = 1; r <= repeticiones; r++) {
            System.out.println("\nSemana " + r + ":");
            for (int i = 0; i < dias.size(); i++) {
                System.out.println("Hoy es: " + dias.get(i));
            }
        }
        scan.close();
    }
}
