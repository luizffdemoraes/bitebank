package teste;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura"; // Forma correta de inicialização -> sintaxe object literal string é uma classe
        // String outro = new String("Alura"); // Má pratica
        // Uma String é imutavel ao ser inicializada para alterações necessário a criação de uma nova string.

        String outra = nome.replace("A", "a");
        // nome.toLowerCase();

        System.out.println(nome);
        System.out.println(outra);
    }
}
