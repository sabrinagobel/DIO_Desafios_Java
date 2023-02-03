import java.io.IOException;
import java.util.Scanner;

    public class ViraTempo {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            while (leitor.hasNext()) {
                int graus = leitor.nextInt();
                if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
                if (graus >= 270 && graus < 360) System.out.println("De Madrugada!!");
                if (graus >= 180 && graus < 270) System.out.println("Boa Noite!!");
                if (graus >= 90 && graus < 180) System.out.println("Boa Tarde!!");
            }
            leitor.close();
        }
    }



    /*
    import java.io.IOException;
import java.util.Scanner;

public class {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int graus = leitor.nextInt();
    		if (                                ) System.out.println("Bom Dia!!");




    		else System.out.println("Bom Dia!!");
    	}
    }

}
     */
