package EjercicioClase2;

public class Profesor extends Persona {
    private String cursoACargo;
    private boolean esAyudante;

    public Profesor(String nombre, String apellido, String cursoACargo, boolean esAyudante) {
        super(nombre, apellido);
        this.cursoACargo = cursoACargo;
        this.esAyudante = esAyudante;
    }

    public String getCursoACargo() {
        return cursoACargo;
    }

    public void setCursoACargo(String cursoACargo) {
        this.cursoACargo = cursoACargo;
    }

    public boolean isEsAyudante() {
        return esAyudante;
    }

    public void setEsAyudante(boolean esAyudante) {
        this.esAyudante = esAyudante;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Curso a cargo: " + cursoACargo +
                " | Es ayudante: " + (esAyudante ? "Sí" : "No"));
    }
}
