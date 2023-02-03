import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        leitor.close();
        int x = a*b - c*d;
        System.out.println("DIFERENCA = "+ x);
    }

}

// Leia quatro valores inteiros A, B, C e D.
// A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
// DIFERENCA = (A * B - C * D).