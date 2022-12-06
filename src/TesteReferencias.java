public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        primeiraConta.deposita(300);

        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
        segundaConta.deposita(100);

        System.out.println("Salda da segunda conta: " + segundaConta.getSaldo());
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("Conta diferente");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
