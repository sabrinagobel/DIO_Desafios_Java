package Presente;

import java.util.Scanner;

public class PresenteGFT {

    public static void main (String[] args) {
        PresenteGFT presenteGFT = new PresenteGFT();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ano de entrada do funcionário: ");
        presenteGFT.qualPresente(presenteGFT.calculaTempoDeCasa(scanner.nextInt()));
    }

    public int calculaTempoDeCasa(int anoEntrada) {
        return 2021-anoEntrada;
    }

    public void qualPresente(int tempoDeCasa) {
        switch (tempoDeCasa) {
            case 1:
                System.out.println("Vale Presente");
                break;
            case 2:
                System.out.println("Smart Watch");
                break;
            case 5:
                System.out.println("Fone Bluetooth");
                break;
            case 10:
                System.out.println("Vale Jantar");
                break;
            case 15:
                System.out.println("Vale Jantar top");
                break;
            default:
                System.out.println("Esse ano não vai ter presente");
        }
    }
}
