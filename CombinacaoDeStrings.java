import java.util.Scanner;

public class CombinacaoDeStrings {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for (int i = 0; i < n; i++) {

            String resto = new String();
            String combinacao = new String();
            String a = leitor.next();
            String b = leitor.next();
            leitor.close();
            int ta = a.length();
            int tb = b.length();
            int menor = 0;

            if (ta > tb) {
                menor = tb;
                resto = a.substring(tb, ta);
            } else {
                menor = ta;
                resto = b.substring(ta, tb);
            }
            for (int j = 0; j < menor; j++) {
                combinacao += String.valueOf(a.charAt(j)) + String.valueOf(b.charAt(j));
            }
            combinacao += resto;
            System.out.println(combinacao);
        }
    }
}






/* PROPOSTA
Desafio
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.
Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela
segunda letra da primeira string e continuar dessa forma sucessivamente.
As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.
A entrada contém vários casos de teste.
A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém
entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.


Exemplo de Entrada	    Exemplo de Saída
2
aA Bb                   aBAb
aa bb                   abab


import java.util.Scanner;
public class Desafio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			if (       >           ) {
			} else {
			}
			for (  int j=0; j <  ; j++) {
			}
			resultado +=  ;
			System.out.println(resultado);
		}
	}
}
 */








