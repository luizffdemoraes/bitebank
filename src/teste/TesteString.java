package teste;

public class TesteString {

    public static void main(String[] args) {


        String vazio = " Alura ";
        String outroVazio = vazio.trim();

        System.out.println(outroVazio);

        // String vazio = "";
        // System.out.println(vazio.isEmpty());

        // String nome = "Alura"; // Forma correta de inicialização -> sintaxe object literal string é uma classe
        // String outro = new String("Alura"); // Má pratica
        // Uma String é imutavel ao ser inicializada para alterações necessário a criação de uma nova string.

        // System.out.println(nome.length());

        // for(int i = 0; i < nome.length(); i++){
        //    System.out.println(nome.charAt(i));
        // }

        // String sub = nome.substring(1);
        // System.out.println(sub);

        // char c = 'A';
        // char d = 'a';
        // String outra = nome.replace(c, d);

        // char c = nome.charAt(2);
        // System.out.println(c);

        //int pos = nome.indexOf("ur");
        // System.out.println(pos);

        // String é um sequencia de caracter ""
        // Char é um unico caracter ''
        // String outra = nome.replace("A", "a");
        // nome.toLowerCase();
        // String outra = nome.toUpperCase();

        // System.out.println(nome);
        // System.out.println(outra);
    }
}
