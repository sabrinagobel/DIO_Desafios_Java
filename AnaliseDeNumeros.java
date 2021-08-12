import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            int a = leitor.nextInt();
            if (a%2 != 0) impares++;
            else pares ++;
            if (a>0) positivos ++;
            if (a<0) negativos ++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}

// Você deve fazer a leitura de 5 valores inteiros.
// Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores
// informados são positivos e quantos valores informados são negativos.