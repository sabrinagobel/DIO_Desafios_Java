import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = N; i > 1; i--) {
            N = N * (i - 1);
        }
        System.out.println(N);
    }
}


/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.


Exemplo de Entrada	Exemplo de Saída
4                   24


import java.util.Scanner;
public class Problem {
	public static void main(String[] args) {
              //complete o código com sua solução
	}
}
 */
