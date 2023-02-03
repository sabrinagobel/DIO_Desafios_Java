import java.io.IOException;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        leitor.close();
        if (a % b == 0) System.out.println("Sao Multiplos");
        else if (b % a == 0) System.out.println("Sao Multiplos");
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
}

// Leia 2 valores inteiros (A e B).
// Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
// múltiplos entre si.