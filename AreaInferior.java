import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        int posicaoHorizontal = 5;
        int limiteHorizontal = 6;
        int posicaoVertical = 7;

        for (; posicaoVertical < 12; posicaoVertical++) {
            for (; posicaoHorizontal <= limiteHorizontal ; posicaoHorizontal++) {
                soma += M[posicaoVertical][posicaoHorizontal];
            }
            limiteHorizontal++;
            posicaoHorizontal = 11 - limiteHorizontal;
        }
        if (O == 'M') soma = (soma / (((M.length * M.length) - 24) / 4));
        System.out.println(String.format("%.1f", soma));
    }
}


/*
import java.io.IOException;
import java.util.Scanner;

public class Desafio{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (        ; i <     ; i++) {
        	for (int   ; j <     ; j++) {
        		M[i][j] = leitor.nextDouble();
        	}
        }

        for (int     ; i <        ; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		if (                   ) soma += M[i][j];
        	}
        }

        if (              ) soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }

}
 */