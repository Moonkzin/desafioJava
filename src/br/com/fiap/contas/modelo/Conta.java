package br.com.fiap.contas.modelo;

public abstract class Conta {
    protected double saldo;
    private String titular;
    private int numero;
    private String agencia;

    public void deposita(double value){
        this.saldo += value;
    }

    public void saca(double value){
        this.saldo += value;
    }

    public String getTipo() {
        return "Conta";
    }

    public void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

}
