public class TestaBanco {
    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        contaDoPaulo.deposita(100);
        System.out.println(contaDoPaulo.getTitular());
    }
}
