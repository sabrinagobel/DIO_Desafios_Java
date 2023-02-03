import java.util.Scanner;

public class TestaCalculoFrete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carga carga = new Carga();

        System.out.println("Peso da carga: ");
        carga.setPeso(scanner.nextDouble());
        System.out.println("Valor da carga: ");
        carga.setValor(scanner.nextDouble());
        System.out.println("Distância: ");
        int distancia = scanner.nextInt();

        Vagao vagao = new Vagao(carga);
        Caminhao caminhao = new Caminhao(carga);

        System.out.println("Frete por vagão: " + vagao.calculaFrete(distancia));
        System.out.println("Frete por caminhão: " + caminhao.calculaFrete(distancia));

    }
}

abstract class Transporte {
    private Carga carga;

    public Transporte(Carga carga){
        this.carga = carga;
    }

    protected Transporte() {
    }

    public double calculaFrete(int distancia) {
        return 0;
    }
}


public class Vagao extends Transporte {

    Carga carga;

    public Vagao(Carga carga) {
        this.carga = carga;
    }

    @Override
    public double calculaFrete(int distancia) {
        double adicional = 0;
        if (carga.getPeso() < 15000) adicional = 5000;
        return ((carga.getPeso() * 0.07) + (carga.getValor() * 0.01) + (distancia * 0.5) + adicional);
    }
}

public class Caminhao extends Transporte {

    Carga carga;

    public Caminhao(Carga carga) {
        this.carga = carga;
    }

    @Override
    public double calculaFrete(int distancia) {
        double desconto = 1;
        if (carga.getValor() > 40000) desconto = 0.75;
        return (((carga.getPeso() * 0.02) + (carga.getValor() * 0.03) + (distancia * 2)) * desconto);
    }
}

public class Carga {
    private double valor;
    private double peso;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


