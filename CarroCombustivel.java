import java.util.Scanner;

public class CarroCombustivel extends Carro {
    private String combustivel;

    public static void main (String[] args) {
        CarroCombustivel carroCombustivel = new CarroCombustivel();
        carroCombustivel.dieselOuGasolina();
    }

    public void dieselOuGasolina(){

        Scanner scanner = new Scanner(System.in);
        int gasolina = 0;
        int diesel = 0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Informe o modelo do " + i + "º carro: ");
            this.setModelo(scanner.next());
            System.out.println("Informe a marca do " + i + "º carro");
            this.setMarca(scanner.next());
            System.out.println("Informe o combustível do " + i + "º carro");
            this.setCombustivel(scanner.next());
            if (this.getCombustivel().equalsIgnoreCase("gasolina")) gasolina++;
            else if (this.getCombustivel().equalsIgnoreCase("diesel")) diesel++;
        }
        System.out.println("Foram informados: " + gasolina + " carro(s) a gasolina e " + diesel + " carro(s) a diesel");
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}

public class Carro {
    private String modelo;
    private String marca;

    public Carro() {
        this.modelo = "";
        this.marca = "";
    }

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}