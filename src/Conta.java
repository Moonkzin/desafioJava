public class Conta {
    double saldo;
    String titular;
    int numero;
    String agencia;

    public void depositar(int value){
        this.saldo += value;
    }

    public void sacar(int value){
        this.saldo += value;
    }
}
