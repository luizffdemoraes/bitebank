package teste;

public class Teste {

    // Array [] estrtutura de dados
    public static void main(String[] args) {

        int[] idades = new int[5]; //inicializa o array com os valores padrões 0
        // idades[0] = 19;
        // idades[1] = 29;
        // idades[2] = 39;
        // idades[3] = 49;
        // idades[4] = 59;

        for (int i = 0; i < idades.length; i ++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i ++) {
            System.out.println(idades[i]);
        }

        // int idade1 = idades[0];

        // System.out.println(idade1);

        // System.out.println(idades.length);
    }
}
