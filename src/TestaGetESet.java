public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");
    }

}
