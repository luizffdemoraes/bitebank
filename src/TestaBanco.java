public class TestaBanco {
    public static void main(String[] args) {

        Cliente clientePaulo = new Cliente();
        clientePaulo.cpf = "222.222.222-22";
        clientePaulo.nome = "Paulo Silveira";
        clientePaulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        contaDoPaulo.titular = clientePaulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
