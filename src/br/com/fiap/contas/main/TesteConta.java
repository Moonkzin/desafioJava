package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;

public class TesteConta {

    public static void main(String[] args) {
        ContaCorrente CC = new ContaCorrente();
        ContaPoupanca CP = new ContaPoupanca();

        CC.deposita(-5);
        System.out.println(CC.getTipo());
        System.out.println(CP.getTipo());
    }
}
