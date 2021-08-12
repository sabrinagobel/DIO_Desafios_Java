import java.io.IOException;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n = leitor.nextInt();

        while (n >= 1){
            soma += n;
            cont ++;
            n = leitor.nextInt();
        }

        double media = ((double) soma / cont);
        System.out.println(String.format("%.2f", media));
    }

}

// Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
// O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
// Calcular e imprimir a idade média deste grupo de indivíduos.
