package teste;

import modelo.Conta;
import modelo.ContaCorrente;

public class TestBiblioteca {

    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.3);
        System.out.println(c.getSaldo());
    }
}
