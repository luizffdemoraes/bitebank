public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.pegaSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.pegaSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(300);

        System.out.println("Primeira conta tem o saldo.: " + primeiraConta.pegaSaldo());
        System.out.println("Segunda conta tem o saldo.: " + segundaConta.pegaSaldo());

        primeiraConta.agencia = 146;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta " + " na agencia " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferente");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}