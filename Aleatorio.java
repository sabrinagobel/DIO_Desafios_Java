package Aleatorio;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    int numero;

    public static void main(String[] args) {
        Aleatorio aleatorio = new Aleatorio();
        while (aleatorio.compara());
    }


    public boolean compara (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 7");
        numero = scanner.nextInt();
        Random random = new Random();
        int rand = random.nextInt(7-0);
        if (numero != rand) {
            System.out.println(rand);
            System.out.println("Tente novamente");
            return true;
        }
        else {
            System.out.println("Você acertou");
            return false;
        }

    }
}
