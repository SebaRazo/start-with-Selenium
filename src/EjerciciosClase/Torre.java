package EjerciciosClase;

public class Torre extends Personaje {
    private int nivel;
    public Torre(String nombre, int salud, int nivel) {
        super(nombre, salud);
        this.nivel = nivel;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    @Override
    public void entrenar() {
        nivel += 1;
        System.out.println(getNombre() + " ha entrenado. Nivel actual: " + nivel);
    }
}
