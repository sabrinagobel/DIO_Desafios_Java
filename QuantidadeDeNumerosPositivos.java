import java.io.IOException;
import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int quant = 0;
        while (cont < 6 ) {
            float x = leitor.nextFloat();
            if ( x > 0) quant++;
            cont++;
        }
        leitor.close();
        System.out.println(quant + " valores positivos");
    }
}

// Crie um programa que leia 6 valores.
// Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos.
// Em seguida, apresente a quantidade de valores positivos digitados.