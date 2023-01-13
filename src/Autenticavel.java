//contrato Autenticavel
    // quem assinar esse contrato, precisa implementar
    // método setSenha
    // método autentica
public abstract interface Autenticavel {
    // Uma interface não pode ter nada concreto

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}