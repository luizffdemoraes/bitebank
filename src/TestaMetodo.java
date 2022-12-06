public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        contaDoPaulo.deposita(100);
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.getSaldo());

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta(1337, 24226, 1, new Cliente("Marcela Silveira", "222.222.222-22", "Programador"));
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);

        if (sucessoTransferencia) {
            System.out.println("Transferencia feita com sucesso.");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
    }
}

