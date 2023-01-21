package teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutroWrappers {

    public static void main(String[] args) {

        int idade = 29; // Integer
        // Integer idadeRef = new Integer(29); deprecated

        Integer idadeRef = Integer.valueOf(idade); // Autoboxing
        int value = idadeRef.intValue(); // Unboxing

        System.out.println(idadeRef.doubleValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int numero = Integer.parseInt("29"); // Conversão de String para tipo primitivo

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing
    }
}
