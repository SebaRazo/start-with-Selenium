package EjerciciosDeConsola;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosLista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        System.out.println("Ingrese números (solo se almacenarán si son menores o iguales a 500).");
        System.out.println("Para finalizar, ingrese un número mayor a 500.\n");

        // Bucle para ingresar números hasta que uno sea mayor a 500
        do {
            System.out.print("Ingrese un número: ");
            numero = scan.nextInt();

            if (numero <= 500) {
                numeros.add(numero);
            }

        } while (numero <= 500);

        // Mostrar los datos ingresados
        System.out.println("\nNúmeros ingresados: " + numeros);
        System.out.println("Cantidad de números almacenados: " + numeros.size());

        // Evaluar cantidad ingresada
        if (numeros.size() < 10) {
            System.out.println("Se ingresaron pocos números.");
        } else {
            System.out.println("Se excedió la cantidad de ingresos.");
        }

        scan.close();
    }
}
