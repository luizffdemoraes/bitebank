public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        

        Funcionario funcionario = new Gerente();
        funcionario.setNome("Nico Steppat");
        funcionario.setCpf("856.754.700-85");
        funcionario.setSalario(2600.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
