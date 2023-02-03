import java.io.IOException;
import java.util.Scanner;

public class AreaEsquerda {

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
        leitor.close();
        int posicaoHorizontal = 0;
        int limiteHorizontal = 0;
        int posicaoVertical = 1;
        while (posicaoVertical < 6) {
            while (posicaoHorizontal <= limiteHorizontal) {
                soma += M[posicaoVertical][posicaoHorizontal];
                posicaoHorizontal ++;
            }
            limiteHorizontal++;
            posicaoVertical++;
            posicaoHorizontal = 0;
        }
        limiteHorizontal --;

        while (posicaoVertical <=11) {
            while (posicaoHorizontal <= limiteHorizontal) {
                soma += M[posicaoVertical][posicaoHorizontal];
                posicaoHorizontal ++;
            }
            limiteHorizontal--;
            posicaoVertical++;
            posicaoHorizontal = 0;
        }

        if (O == 'M') soma /= 30;
        System.out.printf("%.1f%n", soma);
    }
}


/*


import java.io.IOException;
import java.util.Scanner;

public class {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (                   ) {
        	for (                      ) {
        		M[i][j] = leitor.nextDouble();
        	}
        }

        for (                   ) {
        	for (                      ) {
        		if (                 ) soma += M[i][j];
        	}
        }

        if (                    ) soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }

}
 */


