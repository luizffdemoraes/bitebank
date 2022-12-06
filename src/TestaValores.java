public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));

        System.out.println(conta.getAgencia());

        System.out.println(Conta.getTotal());
    }
}
