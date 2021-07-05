import java.util.Scanner;

public class EntradaESaidaCPF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] cpf = new String[4];
        String linha = sc.nextLine();

        for (int i = 0; i < 4; i++) {
            cpf = linha.split("\\.|-");


            System.out.println(cpf[i]);
        }
        sc.close();
    }
}

// Elabore um programa que possua as características abaixo:
// Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
// Imprima os quatro grupos numéricos, sendo um valor por linha.