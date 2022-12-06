public class TestaBanco {
    public static void main(String[] args) {

        Cliente clientePaulo = new Cliente();
        clientePaulo.setCpf("222.222.222-22");
        clientePaulo.setNome("Paulo Silveira");
        clientePaulo.setProfissao("Programador");

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        contaDoPaulo.setTitular(clientePaulo);
        System.out.println(contaDoPaulo.getTitular());
    }
}
