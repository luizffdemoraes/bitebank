public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        segundaConta.deposita(300);

        System.out.println("Primeira conta tem o saldo.: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem o saldo.: " + segundaConta.getSaldo());

        primeiraConta.setAgencia(146);
        System.out.println(primeiraConta.getAgencia());
        System.out.println(primeiraConta.getNumero());

        System.out.println(segundaConta.getAgencia());

        segundaConta.setAgencia(146);
        System.out.println("Agora a segunda conta esta " + " na agencia " + segundaConta.getAgencia());

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferente");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}