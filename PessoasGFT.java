import java.util.Scanner;

public class Programa {

    Scanner scanner = new Scanner(System.in);
    int starter;
    int junior;
    int senior;


    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.entradaDados();
        programa.saidaDados();
    }

    public void entradaDados(){
        Pessoa pessoa = new Pessoa();
        System.out.println("Quantas pessoas serão informadas?");
        int quantidade = scanner.nextInt();
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Informe o nome da " + i + "ª pessoa: ");
            pessoa.setNome(scanner.next());
            System.out.println("Informe o cargo da " + i + "ª pessoa (Starter, Junior ou Sênior");
            pessoa.setCargo(scanner.next());
            if (pessoa.getCargo().equalsIgnoreCase("Starter")) starter++;
            else if (pessoa.getCargo().equalsIgnoreCase("Junior")) junior++;
            else senior++;
        }
    }

    public void saidaDados(){
        System.out.println("Total de pessoas" +
                "\nStarter: " + starter +
                "\nJunior: " + junior +
                "\nSenior: " + senior);
    }


}

public class Pessoa {
    private String nome;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

