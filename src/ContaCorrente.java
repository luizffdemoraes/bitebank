public class ContaCorrente extends Conta implements  Tributavel{
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
    }

    @Override
    public double getValorImposto() {
        return getSaldo() * 0.01;
    }
}