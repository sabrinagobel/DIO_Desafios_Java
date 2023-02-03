package Elefante;

import java.util.Scanner;

public class Incomoda {

    public static void main (String[] args) {
        String repete = "incomodam ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de elefantes");
        int quantoIncomoda = scanner.nextInt();

        if (quantoIncomoda == 1) System.out.println("Um elefante incomoda muita gente.");
        else
            System.out.println(quantoIncomoda + " elefantes " + repete.repeat(quantoIncomoda)+ "muito mais.");
    }
}
