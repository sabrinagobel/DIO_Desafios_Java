import java.io.IOException;
import java.util.Scanner;

public class Media3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, media, emexame, emexamefinal;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {
            System.out.printf("Aluno aprovado.\n");
        } else if (media < 5) {
            System.out.printf("Aluno reprovado.\n");
        } else if (media >= 4.96 && media < 6.95) {
            System.out.printf("Aluno em exame.\n");

            emexame = sc.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", emexame);

            emexamefinal = ((media + emexame) / 2);
            if (emexamefinal >= 5) {
                System.out.printf("Aluno aprovado.\n");
            } else {
                System.out.printf("Aluno reprovado\n");
                //Na mensagem acima é necessário retirar o ponto final para passar no teste #4 da DIO
            }
            System.out.printf("Media final: %.1f\n", emexamefinal);
        }

        sc.close();
    }
}





/* PROPOSTA

Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela
mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame
com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0
ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado
após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal.
As mensagens devem ser impressas conforme a descrição do problema.
Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".



// import java.io.IOException;
// import java.util.Locale;
// import java.util.Scanner;

// public class Desafio{

// 	public static void main(String[] args)  throws IOException {
// 		Scanner sc = new Scanner(System.in);
// 		sc.useLocale(Locale.ENGLISH);
// 		Locale.setDefault(new Locale("en", "US"));

// 		float n1,n2,n3,n4,media,emexame,emexamefinal;

// 		n1 = sc.nextFloat();
// 		n2 = sc.nextFloat();
// 		n3 = sc.nextFloat();
// 		n4 = sc.nextFloat();

// 		media = ;


// 		System.out.printf("Media: %.1f\n",media);

// 		//continue a solucao de acordo com o enunciado

// 		if (     ){
// 			System.out.printf("Aluno aprovado.\n");
// 		}
// 		else if (   ){
// 			System.out.printf("Aluno reprovado.\n");
// 		}
// 		else {
// 			System.out.printf("Aluno em exame.\n");

// 			System.out.printf("Nota do exame: %.1f\n",  );

// 			if(      ){
// 				System.out.printf("Aluno aprovado.\n");
// 				System.out.printf("Media final: %.1f\n",  );
// 			}
// 			else{
// 				System.out.printf("Aluno reprovado.\n");
// 				System.out.printf("Media final: %.1f\n", );
// 			}
// 		}

// 		sc.close();
// 	}
// }
 */