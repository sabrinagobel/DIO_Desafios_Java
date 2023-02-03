public class TestaContas {
    public static void main (String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(100);
        contaCorrente.setRendimento(contaCorrente.retornaRendimentoMensal(contaCorrente.getSaldo()));
        contaCorrente.setNumero(001);
        contaCorrente.setTitular("Josefina");
        System.out.println("Conta Corrente numero " + contaCorrente.getNumero() + "\nTitular " + contaCorrente.getTitular() + "\nsaldo " + contaCorrente.getSaldo() + "\nrendimento " + contaCorrente.getRendimento());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(100);
        contaPoupanca.setRendimento(contaPoupanca.retornaRendimentoMensal(contaPoupanca.getSaldo()));
        contaPoupanca.setNumero(002);
        contaPoupanca.setTitular("Carlota");
        System.out.println("\n\nConta Poupança numero " + contaPoupanca.getNumero() + "\nTitular " + contaPoupanca.getTitular() + "\nsaldo " + contaPoupanca.getSaldo() + "\nrendimento " + contaPoupanca.getRendimento());
    }
}

abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double rendimento;

    public double retornaRendimentoMensal(double saldo){
        return rendimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}

class ContaCorrente extends Conta {

    @Override
    public double retornaRendimentoMensal(double saldo) {
        return saldo * 0.05;
    }
}


public class ContaPoupanca extends Conta {
    @Override
    public double retornaRendimentoMensal(double saldo) {
        return saldo * 0.07;
    }
}
