import java.util.Scanner;

public class ParesEntreCincoNumeros {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n%2 == 0) count++;
        }
        System.out.printf("%d valores pares\n", count);
        scan.close();
    }
}


/*


import java.util.Scanner;

public class Problem{

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int count = 0;

		for(int i = 0; i < 5; i++) {
			int n = scan.nextInt();

			//complete com sua solução aqui
		}


		System.out.printf("%d valores pares\n", count);
	}
}
 */
