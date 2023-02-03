package Multiplica;

import java.util.Scanner;

public class Multiplica {
    int multiplicando;
    int multiplicadorInicial;
    int multiplicadorFinal;

    public static void main (String[] args) {
        Multiplica multiplica = new Multiplica();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplicando: ");
        multiplica.multiplicando = scanner.nextInt();
        if (multiplica.multiplicando > 1000) {
            System.out.println("Valor não pode ser maior que 1000");
            return;
        }
        System.out.println("Início do Intervalo: ");
        multiplica.multiplicadorInicial = scanner.nextInt();
        if (multiplica.multiplicadorInicial > 1000) {
            System.out.println("Valor não pode ser maior que 1000");
            return;
        }
        if (multiplica.multiplicadorInicial < 0) {
            System.out.println("Valor não pode ser negativo");
            return;
        }


        System.out.println("Fim do Intervalo: ");
        multiplica.multiplicadorFinal = scanner.nextInt();
        if (multiplica.multiplicadorFinal > 1000) {
            System.out.println("Valor não pode ser maior que 1000");
            return;
        }
        if (multiplica.multiplicadorFinal < 0) {
            System.out.println("Valor não pode ser negativo");
            return;
        }
        if (multiplica.multiplicadorFinal <= multiplica.multiplicadorInicial) {
            System.out.println("O início do intervalo deve ser menor que seu fim");
            return;
        }
        if ((multiplica.multiplicadorFinal - multiplica.multiplicadorInicial) >= 10) {
            System.out.println("O intervalo não pode ter uma diferença maior que 10");
            return;
        }
        while (multiplica.multiplicadorInicial != (multiplica.multiplicadorFinal + 1)) {
            System.out.println(multiplica.multiplicando +
                    " x " +
                    multiplica.multiplicadorInicial +
                    " = " +
                    (multiplica.multiplicando * multiplica.multiplicadorInicial));

            multiplica.multiplicadorInicial ++;
        }

    }
}
