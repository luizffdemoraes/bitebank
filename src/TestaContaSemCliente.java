public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());
        Cliente cliente = new Cliente();
        cliente.setNome("Marcela");

        contaDaMarcela.setTitular(cliente);
        System.out.println(contaDaMarcela.getTitular());
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
