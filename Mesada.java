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
