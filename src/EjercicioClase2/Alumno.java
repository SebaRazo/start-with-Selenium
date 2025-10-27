package EjercicioClase2;

public class Alumno extends Persona {
   private String legajo;
   private double promedioNota;

    public Alumno(String nombre, String apellido, String legajo, double promedioNota ) {
        super(nombre, apellido);
        this.legajo = legajo;
        this.promedioNota = promedioNota;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public double getPromedioNota() {
        return promedioNota;
    }

    public void setPromedioNota(double promedioNota) {
        this.promedioNota = promedioNota;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Legajo: " + legajo + " | Promedio: " + promedioNota);
    }
}
