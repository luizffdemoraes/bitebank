package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);

        contas[0] = cc1;
        contas[1] = cc2;

        ContaPoupanca referencia = (ContaPoupanca) contas[1];

        System.out.println(cc2.getNumero());
        System.out.println(referencia.getNumero());
    }
}
