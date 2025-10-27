package EjerciciosClase;

public class Mago extends Personaje implements Ofensivo{
    private int poder;
    private String tipoMagia; // Dos opciones: "Encantamiento" o "Maléfico"
    public Mago(String nombre, int salud, int poder, String tipoMagia) {
        super(nombre, salud);
        this.poder = poder;
        this.tipoMagia = tipoMagia;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipoMagia() {
        return tipoMagia;
    }

    public void setTipoMagia(String tipoMagia) {
        this.tipoMagia = tipoMagia;
    }

    @Override
    public void entrenar() {
        if (tipoMagia.equalsIgnoreCase("Encantamiento")) {
            poder += 3;
        } else if (tipoMagia.equalsIgnoreCase("Maléfico")) {
            poder += 5;
        }
        System.out.println(getNombre() + " ha entrenado. Poder actual: " + poder);
    }

    // Método atacar
    @Override
    public void atacar(Personaje unPersonaje) {
        int danio = poder * 5;
        System.out.println(getNombre() + " está atacando a " + unPersonaje.getNombre() +
                " con un daño de " + danio);
        unPersonaje.setSalud(unPersonaje.getSalud() - danio);
    }
}
