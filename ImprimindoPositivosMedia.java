import java.io.IOException;
import java.util.Scanner;

public class ImprimindoPositivosMedia {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		int somaInteiros = 0;
		float somaFloat = 0f;
		double somaDouble = 0d;
		double media = 0;
		for (int i=0; i<6; i++) {
			if (leitor.hasNextInt()) {
				int nextInt = leitor.nextInt();
				if (nextInt > 0) {
					cont++;
					somaInteiros += nextInt;
				}
			} else if (leitor.hasNextFloat()) {
				float nextFloat = leitor.nextFloat();
				if (nextFloat > 0) {
					cont++;
					somaFloat += nextFloat;
				}
			} else if (leitor.hasNextDouble()) {
				double nextDouble = leitor.nextDouble();
				if (nextDouble > 0) {
					cont ++;
					somaDouble += nextDouble;
				}
			}
		}
		leitor.close();
		media=((somaInteiros+somaDouble+somaFloat)/cont);
	System.out.println(cont+" valores positivos");
	System.out.println(String.format("%.1f",media));
	}
}


/*
 * Desafio Leia 6 valores. Em seguida, mostre quantos destes valores digitados
 * foram positivos. Na próxima linha, deve-se mostrar a média de todos os
 * valores positivos digitados, com um dígito após o ponto decimal.
 * 
 * Entrada A entrada contém 6 números que podem ser valores inteiros ( int ) ou
 * de ponto flutuante ( float ou double ). Pelo menos um destes números será
 * positivo.
 * 
 * Saída O primeiro valor de saída é a quantidade de valores positivos. A
 * próxima linha deve mostrar a média dos valores positivos digitados.
 * 
 * Exemplo de Entrada 				Exemplo de Saída 
 * 7 -5 6 -3.4 4.6 12				4 valores positivos 7.4
 */