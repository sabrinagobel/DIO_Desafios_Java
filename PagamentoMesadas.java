package Mesada;

public class PagamentoMesadas {



    public static void main(String[] args){
        Mesada mesada = new Mesada();
        mesada.pagarMesada(10000);
        System.out.println("Saldo do filho é " + mesada.consultarSaldo());
//        mesada.sacarMesada(10000);
        MesadaFilhoBonzinho mesadaFilhoBonzinho = new MesadaFilhoBonzinho();
        mesadaFilhoBonzinho.sacarMesada(10000);
        System.out.println("Saldo pai " + mesada.saldoPai);
        System.out.println("Saldo filho " + mesada.saldoFilho);
        System.out.println("Saldo pai do filho bonzinho " + mesadaFilhoBonzinho.saldoPai);
        System.out.println("Saldo filho bonzinho " + mesadaFilhoBonzinho.saldoFilho);
    }
}

public class MesadaFilhoBonzinho extends Mesada {

    public MesadaFilhoBonzinho() {
    }

    @Override
    public void sacarMesada(double valorSaque){
        if (valorSaque <= saldoFilho) {
            saldoFilho -= valorSaque;
            saldoPai += (valorSaque*5);
        }
    }


}

public class Mesada {
    double saldoPai;
    double saldoFilho;

    public Mesada(){
    }

    public void pagarMesada(double valor){
        saldoPai-=valor;
        saldoFilho+=valor;
    }

    public void sacarMesada(double valorSaque){
        if (valorSaque <= saldoFilho) {
            saldoFilho -= valorSaque;
            saldoPai += (valorSaque*0.05);
        }
    }

    public double consultarSaldo(){
        return saldoFilho;
    }


}
