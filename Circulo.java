import java.util.Scanner;

public class Testar {

    public static void main (String[] args){
        Circulo circulo = new Circulo(5);
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Area: " + circulo.area() + "metros quadrados");
        System.out.println("Circunferencia: " + circulo.circunferencia());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o percentual de aumento do raio: ");
        circulo.aumentarRaio(scanner.nextDouble());
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Area: " + circulo.area() + "metros quadrados");
        System.out.println("Circunferencia: " + circulo.circunferencia());
    }
}


public class Circulo {

    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public double area(){
        return (Math.pow(this.getRaio(),2))*3.14;
    }

    public double circunferencia(){
        return (2*3.14*this.getRaio());
    }

    public void aumentarRaio(double percentual){
        raio = raio + ((percentual*this.getRaio())/100);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
