package EjercicioBanco;
//Excepciones Personalizadas - Ejemplo cuenta bancaria
public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Sebastian", 7000);


        // Caso 1: Monto inválido
        try {
            cuenta1.transferir(0);
        } catch (MontoInvalido | SaldoInsuficiente e){
            System.out.println("❌ Error: " + e.getMessage());
        }

        // Caso 2: Saldo insuficiente
        try {
            cuenta1.transferir(8000);
        } catch (MontoInvalido | SaldoInsuficiente e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // Caso 3: Transferencia válida
        try {
            cuenta1.transferir(1500);
        } catch (MontoInvalido | SaldoInsuficiente e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        System.out.println("\n💰 Saldo final: $" + cuenta1.getSaldo());
    }
}
