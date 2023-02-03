package CincoNumeros;

import java.util.*;

public class CincoNumeros {

    public static void main (String[] args) {
        SortedSet<Integer> numeros = new TreeSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numeros.add(scanner.nextInt());
        }
        if (numeros.size() == 1) System.out.println("Os cinco números são iguais");
        else
            System.out.println("O maior número é " + numeros.last() + " e o menor é " + numeros.first());
    }
}
