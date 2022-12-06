public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        System.out.println(contaDaMarcela.getSaldo());
        Cliente cliente = new Cliente("Paulo Silveira", "222.222.222-22", "Programador");
        cliente.setNome("Marcela");

        contaDaMarcela.setTitular(cliente);
        System.out.println(contaDaMarcela.getTitular());
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
