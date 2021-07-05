import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        int a = 0;
        SortedMap<Integer, Integer> variavel = new TreeMap<>();
        for (int i = 0; i < tamanho; i++) {
            a = sc.nextInt();
            if (variavel.containsKey(a)) {
                variavel.put(a, (variavel.get(a)+1));
            } else variavel.put(a, 1);
        }
        sc.close();
        variavel.forEach((key, value) -> System.out.println(key + " aparece " + value + " vez(es)"));

    }
}


