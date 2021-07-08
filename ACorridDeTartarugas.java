import java.io.*;
import java.util.StringTokenizer;

public class ACorridDeTartarugas {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         do {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maisVeloz = 0;
            for (int i = 0; i < n; i++) {
                int j = Integer.parseInt(st.nextToken());
                if (j > maisVeloz)
                    maisVeloz = j;
            }
            if (maisVeloz < 10) System.out.println(1+"\n");
            else if (maisVeloz < 20) System.out.println(2+"\n");
            else System.out.println(3+"\n");
        } while (br.ready());
    }
}



/* PROPOSTA


Desafio
A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem
a capturar tartarugas rápidas, e treina-las para faturar milhões em corridas pelo mundo.
Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos.
Cada tartaruga é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas:
A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de tartarugas do grupo, e
a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada tartaruga do grupo.

Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.


Exemplo de Entrada	Exemplo de Saída
10
10 10 10 10 15 18 20 15 11 10
10
1 5 2 9 5 5 8 4 4 3
10
19 9 1 4 5 8 6 11 9 7

3
1
2





import java.io.*;
public class Desafio {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           //continue a solucao de acordo com o solicitado
		int n;
		do {
			n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String s[] = str.split(" ");
			}
			System.out.println(m);
		} while (br.ready());
    }
}
 */
