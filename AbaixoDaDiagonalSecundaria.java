import java.io.IOException;
import java.util.Scanner;

public class AbaixoDaDiagonalSecundaria {

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
        int k = 11;
        for (int i = 0; i < 12; i++) {

            for (int j = 11; j > k; j--) {
                soma += M[i][j];
            }
            k--;
        }

        if (O == 'M') soma  = (soma/(((M.length * M.length) - 12) / 2));
        System.out.println(String.format("%.1f", soma));
        leitor.close();
    }

}