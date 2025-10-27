package EjerciciosClase;

public class MainGame {
    public static void main(String[] args) {
        Espadachin espadachin = new Espadachin("Arthur", 100, 20);
        Mago mago = new Mago("Merlín", 80, 10, "Maléfico");
        Torre torre = new Torre("Torre del Norte", 150, 3);

        System.out.println("--- ENTRENANDO PERSONAJES ---");
        espadachin.entrenar();
        mago.entrenar();
        torre.entrenar();

        System.out.println("\n--- ATAQUES ---");
        espadachin.atacar(mago);
        mago.atacar(espadachin);

        System.out.println("\nSalud final de " + mago.getNombre() + ": " + mago.getSalud());
        System.out.println("Salud final de " + espadachin.getNombre() + ": " + espadachin.getSalud());
    }
}
