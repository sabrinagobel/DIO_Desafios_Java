package NotasMusicais;

import java.util.Scanner;

public class NotasMusicais {

    Scanner scanner = new Scanner(System.in);
    int inicio;
    int fim;

    public static void main(String[] args) {
        NotasMusicais notasMusicais = new NotasMusicais();
        System.out.println("Digite o número inicial: ");
        notasMusicais.inicio = notasMusicais.scanner.nextInt();
        System.out.println("Digite o número final: ");
        notasMusicais.fim = notasMusicais.scanner.nextInt();

        while (notasMusicais.inicio <= notasMusicais.fim) {
            int nota = notasMusicais.inicio;
            if (nota > 6) nota = notasMusicais.inicio%7;
            notasMusicais.inteiroParaNota(nota);
            notasMusicais.inicio ++;
        }
    }

    public void inteiroParaNota(int nota) {
        switch (nota) {
            case 0 -> System.out.println("Dó");
            case 1 -> System.out.println("Ré");
            case 2 -> System.out.println("Mi");
            case 3 -> System.out.println("Fá");
            case 4 -> System.out.println("Sol");
            case 5 -> System.out.println("Lá");
            case 6 -> System.out.println("Si");
        }
    }


}
