package EjercicioBanco;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void transferir(double monto){
        if (monto <= 0){
            throw new MontoInvalido("El monto debe ser mayor que cero");
        }
        if (monto > saldo){
            throw new SaldoInsuficiente("Saldo insuficiente para transferir $" + monto);
        }
        saldo -= monto;
        System.out.println("✅ Transferencia exitosa de $" + monto + ". Saldo restante: $" + saldo);
    }
}
