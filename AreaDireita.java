import java.io.IOException;
import java.util.Scanner;

public class AreaDireita {

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


        int inicioHorizontal = 11;
        int posicaoHorizontal = 11;
        int posicaoVertical = 1;
        while (posicaoVertical < 6) {
            while (posicaoHorizontal <= 11) {
                soma += M[posicaoVertical][posicaoHorizontal];
                posicaoHorizontal ++;
            }
            inicioHorizontal--;
            posicaoVertical++;
            posicaoHorizontal = inicioHorizontal;
        }
        posicaoHorizontal++;
        inicioHorizontal ++;

        while (posicaoVertical <=11) {
            while (posicaoHorizontal <= 11) {
                soma += M[posicaoVertical][posicaoHorizontal];
                posicaoHorizontal ++;
            }
            inicioHorizontal++;
            posicaoVertical++;
            posicaoHorizontal = inicioHorizontal;
        }

        if (O == 'M') soma /= 30;
        System.out.printf("%.1f%n", soma);
    }
}


/*
Desafio
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz, conforme ilustrado abaixo (área verde).
[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][/]
[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][/][X]
[ ][ ][ ][ ][ ][ ][ ][ ][ ][/][X][X]
[ ][ ][ ][ ][ ][ ][ ][ ][/][X][X][X]
[ ][ ][ ][ ][ ][ ][ ][/][X][X][X][X]
[ ][ ][ ][ ][ ][ ][/][X][X][X][X][X]
[ ][ ][ ][ ][ ][ ][\][X][X][X][X][X]
[ ][ ][ ][ ][ ][ ][ ][\][X][X][X][X]
[ ][ ][ ][ ][ ][ ][ ][ ][\][X][X][X]
[ ][ ][ ][ ][ ][ ][ ][ ][ ][\][X][X]
[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][\][X]
[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][\]

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.


Exemplo de Entrada	    Exemplo de Saída
S                       111.4
1.0
330.0
-3.5
2.5
4.1
...






import java.io.IOException;
import java.util.Scanner;

public class  {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (               ) {
        	for (                 ) {
        		M[i][j] = leitor.nextDouble();
        	}
        }

        for (                    ) {
        	for (                     ) {
        		if (                  ) soma += M[i][j];
        	}
        }

        if (                     ) soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }

}
 */