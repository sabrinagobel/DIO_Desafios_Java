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





/*

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;
        import java.util.ArrayList;
        import java.util.Locale;
        import java.util.Scanner;
        import java.util.SortedMap;
        import java.util.TreeMap;

public class minhaClasse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer>  = new ArrayList<Integer>();

        int    =sc.nextInt();
        while(    -->0)
            variavel.add(sc.nextInt());

        SortedMap<Integer, Integer> variavel = new TreeMap<>();
        lista.forEach(id -> variavel.compute(id, (   , ) -> (    == null ? 1 :  + 1)));


        contaQuant.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
*/
