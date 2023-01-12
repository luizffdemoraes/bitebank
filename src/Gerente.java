public class Gerente extends FuncionarioAutenticavel {

    // Rescrita
    public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getSalario();
    }
}
