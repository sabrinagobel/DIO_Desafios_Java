import java.io.IOException;
<<<<<<< HEAD
=======
import java.io.InputStream;
>>>>>>> 337c007b6116ec51278a154f06d4928fc20a175a
import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

}

// Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.