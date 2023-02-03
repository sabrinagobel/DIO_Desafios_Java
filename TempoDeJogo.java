import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        scan.close();
        horas = fim - inicio;

        if (horas == 0) {
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        } else if (horas > 0) {
            System.out.print("O JOGO DUROU " + horas + " HORA(S)\n");
        } else if (horas < 0) {
            System.out.print("O JOGO DUROU " + ((24 - inicio) + fim) + " HORA(S)\n");
        }
    }
}




/*
Desafio
Tento como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.


Exemplo de Entrada	Exemplo de Saída
16 2

O JOGO DUROU 10 HORA(S)

0 0

O JOGO DUROU 24 HORA(S)

2 16

O JOGO DUROU 14 HORA(S)



import java.util.Scanner;

class Problem {
	public static void main(String[] args){

               //complete os espaços em branco com sua solução para o problema

                Scanner scan = new Scanner(System.in);
		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();
		horas =               ;

		if(horas == 0){
			System.out.print("O JOGO DUROU 24 HORA(S)\n");
		}else if(horas < 0){
			System.out.print("O JOGO DUROU " + (          ) + " HORA(S)\n");
		}else if(horas > 24){
			System.out.print("O JOGO DUROU " + (            ) + " HORA(S)\n");
		}else{
			System.out.print("O JOGO DUROU " +             + " HORA(S)\n");
		}
	}
}

 */
