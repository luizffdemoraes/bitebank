public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        String nome = g1.getNome();

        System.out.println(nome);

    }
}
