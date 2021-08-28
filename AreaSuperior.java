import java.io.IOException;
import java.util.Scanner;

public class AreaSuperior {

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

        int i = 0;
        int k = 0;
        int l = 12;
        int m = 1;
        int n = 1;

        while (i < 5) {
            for (; m > k; m++) {
                l--;
                for (; n < l; n++) {
                    soma += M[i][n];
                }
                n = m + 1;
                i++;
            }
        }
        if (O == 'M') soma = (soma / (((M.length * M.length) - 24) / 4));
        System.out.println(String.format("%.1f", soma));
    }
}