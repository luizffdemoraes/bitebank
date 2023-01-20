package teste.util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);

       // boolean igual = cc1.ehIqual(cc2);
        boolean igual = cc1.equals(cc2);
        System.out.println(igual);

        /*
        // Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 33);

        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for (Conta conta : lista) {
            if (conta.equals(cc3)) {
                System.out.println("Já tenho essa referência!");
            }
        }

        for (Conta conta : lista) {
            System.out.println(conta);
        }
         */


    }
}
