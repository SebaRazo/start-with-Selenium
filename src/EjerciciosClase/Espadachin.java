package EjerciciosClase;

public class Espadachin extends Personaje implements Ofensivo{
    private int fuerza;
    public Espadachin(String nombre, int salud, int fuerza){
        super(nombre, salud);
        this.fuerza = fuerza;

    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void entrenar() {
        fuerza += 10;
        System.out.println(getNombre() + " ha entrenado. Fuerza actual: " + fuerza);
    }
    // Método atacar
    @Override
    public void atacar(Personaje unPersonaje) {
        int danio = fuerza *2;
        System.out.println(getNombre() + " está atacando a " + unPersonaje.getNombre() +
                " con un daño de " + danio);
        unPersonaje.setSalud(unPersonaje.getSalud() - danio);
    }
}
