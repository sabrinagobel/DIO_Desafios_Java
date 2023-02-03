import java.util.Scanner;

public class CalculaImposto {

    public static void main(String[] args) {
        Calcula calcula = new Calcula();
        System.out.println("Informe a base de cálculo");
        Scanner scanner = new Scanner(System.in);
        double baseDeCalculo = scanner.nextDouble();
        double imposto;
        double totalImpostos = 0;
        ICMS icms = new ICMS();
        imposto = icms.calculaImposto(baseDeCalculo);
        System.out.println("ICMS = " + imposto);
        totalImpostos += imposto;
        IPI ipi = new IPI();
        imposto = ipi.calculaImposto(baseDeCalculo);
        System.out.println("IPI = " + imposto);
        totalImpostos += imposto;
        COFINS cofins = new COFINS();
        imposto = cofins.calculaImposto(baseDeCalculo);
        System.out.println("COFINS = " + imposto);
        totalImpostos += imposto;
        System.out.println("Valor total dos impostos: " + totalImpostos);
        System.out.println("Valor final com impostos: " + (baseDeCalculo+totalImpostos));
    }
}

public interface Imposto {

    default double calculaImposto(double valor){
        return valor;
    }
}

public class COFINS implements Imposto {
    @Override
    public double calculaImposto(double valor) {
        if (valor > 13000)
            return valor * 0.04;
        else return 0;
    }
}

public class ICMS implements Imposto{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.27;
    }
}

public class IPI implements Imposto {
    @Override
    public double calculaImposto(double valor) {
        if (valor < 25000)
            return valor * 0.05;
        else return valor * 0.11;
    }

}


