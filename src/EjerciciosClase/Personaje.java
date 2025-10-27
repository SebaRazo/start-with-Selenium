package EjerciciosClase;

public abstract class Personaje {
    private String nombre;
    private int salud;
    public Personaje(String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Métodos
    public void descansar(){
        salud +=15;
        System.out.println(nombre + " está descansando. Salud actual: " + salud);
    }
    public boolean estaMuerto(){
        return salud <=0;
    }
    // Método abstracto
    public abstract void entrenar();

    // Método atacar
    //public abstract void atacar(Personaje unPersonaje); Utilizamos la Interfaz.
}
