import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        leitor.close();
        int cont = 0;
        while (cont < 6 ) {
            if ( x % 2  == 1)
                x=x+0;
            else x=x+1;
            System.out.println(x);
            cont ++  ;
            x++;
        }
    }
}

// Leia um valor inteiro X.
// Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.