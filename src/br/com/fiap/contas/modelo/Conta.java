package br.com.fiap.contas.modelo;

public abstract class Conta {
    public double getSaldo() {
        return saldo;
    }

    protected double saldo;
    private String titular;
    private int numero;
    private String agencia;

    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tento depositar um valor negativo");
        } else {
            this.saldo += valor;
        }
    }


    public void saca(double value) {
        this.saldo += value;
    }

    public String getTipo() {
        return "Conta";
    }

    public void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

    @Override
    public String toString() {
        return "[titular=" + titular + ", numero=" + numero
                + ", agencia=" + agencia + "]";
    }
}
