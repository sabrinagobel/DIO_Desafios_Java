import java.util.Scanner;

public class SomaDeHComNTermos {
	public static void main(String[] Args) {

		double h = 0;
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();

		for (double i=1; i<=n; i++) {
			h+= 1/i;
		}
		sc.close();
		System.out.println(Math.round(h));
	}
}


/*
 * Desafio Neste desafio, faça um programa que calcule o valor de H com N
 * termos.
 * 
 * Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
 * 
 * Entrada 
 * A entrada consiste em um número inteiro positivo.
 * 
 * Saída 
 * Na saída será impresso o valor que representa a soma dos termos.
 * 
 * Entrada      Saída 
 * 4 			2
 * 8 			3 
 * 3 			2
 */