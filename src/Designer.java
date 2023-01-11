public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao de Designer");
        return super.getBonificacao() + 100;
    }
}
