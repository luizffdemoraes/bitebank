import java.sql.SQLOutput;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("622.203.840-98");
        g1.setSalario(5000.0);
        g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean autenticou = g1.autenticacao(2222);
        System.out.println(autenticou);
    }
}
