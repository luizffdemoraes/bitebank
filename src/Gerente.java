public class Gerente extends Funcionario {
    private int senha;

    public boolean autenticacao(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    // Rescrita
    public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
}
