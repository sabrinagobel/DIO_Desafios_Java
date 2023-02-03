import java.util.*;

public class Medalhistas {
    List<Atleta> atletas = new ArrayList<>();

    public static void main(String[] args) {
        Medalhistas medalhistas = new Medalhistas();
        medalhistas.entradaDados();
        medalhistas.mostraPodio(medalhistas.atletas);
    }

    public void entradaDados(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            Atleta atleta = new Atleta();
            System.out.println("Digite o nome do Atleta " + i);
            atleta.setNome(scanner.next());
            System.out.println("Digite o país do Atleta " + i);
            atleta.setPais(scanner.next());
            System.out.println("Digite o resultado (em metros) do Atleta " + i);
            atleta.setDistancia(scanner.nextFloat());
            atletas.add(atleta);
        }
    }

    public void mostraPodio(List<Atleta> atletas){
        atletas.sort(Comparator.comparing(Atleta::getDistancia));

        System.out.println("Ouro: " + atletas.get(atletas.size()-1).getNome());
        System.out.println("Prata: " + atletas.get(atletas.size()-2).getNome());
        System.out.println("Bronze: " + atletas.get(atletas.size()-3).getNome());

    }


}

public class Atleta {

    private String nome;
    private String pais;
    private float distancia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
}