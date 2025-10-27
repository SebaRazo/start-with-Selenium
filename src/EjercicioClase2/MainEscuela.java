package EjercicioClase2;

public class MainEscuela {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Seba", "Razo", "A1234", 8.75);
        Profesor profesor1 = new Profesor("Carlos", "Gomez", "Programación I", true);

        System.out.println("=== Información del Alumno ===");
        alumno1.mostrarInfo();

        System.out.println("\n=== Información del Profesor ===");
        profesor1.mostrarInfo();
    }
}
