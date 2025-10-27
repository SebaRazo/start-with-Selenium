package EjercicioBanco;

public class MontoInvalido extends RuntimeException{
    public MontoInvalido(String mensaje){
        super(mensaje);
    }
}
