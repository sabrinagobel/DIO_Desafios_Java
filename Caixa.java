import java.util.ArrayList;
import java.util.List;

public class Caixa {

    List<Object> listaProdutos = new ArrayList<>();

    public static void main(String[] args){
        Caixa caixa = new Caixa();
        caixa.calcularTotal(caixa.popularLista());
    }

//    public List<Produto> popularLista(){
//        listaProdutos.add(new Produto("Eletronico", "Ventilador", 3, 320));
//        listaProdutos.add(new Produto("Eletronico", "Computador", 2, 3999));
//        listaProdutos.add(new Produto("Movel", "Mesa", 2, 270));
//        listaProdutos.add(new Produto("Produto", "Caderno", 10, 10.5));
//        listaProdutos.add(new Produto("Movel", "Cadeira", 2, 234.25));
//        listaProdutos.add(new Produto("Produto", "Caneta", 15, 0.7));
//        return listaProdutos;
//    }

        public List<Object> popularLista(){
        listaProdutos.add(new Eletronico("Ventilador", 3, 320));
        listaProdutos.add(new Eletronico("Computador", 2, 3999));
        listaProdutos.add(new Movel("Mesa", 2, 270));
        listaProdutos.add(new Produto("Caderno", 10, 10.5));
        listaProdutos.add(new Movel("Cadeira", 2, 234.25));
        listaProdutos.add(new Produto("Caneta", 15, 0.7));
        return listaProdutos;
    }


    public void calcularTotal (List<Object> listaProdutos) {
            String nome = "";
            double valor = 0;
            int quantidade = 0;
            double total = 0;
            double totalGeral = 0;

        for (Object item : listaProdutos) {
            if (item.getClass() == Eletronico.class) {
                nome = ((Eletronico) item).getNome();
                valor = ((Eletronico) item).getValor();
                quantidade = ((Eletronico) item).getQuantidade();
                Eletronico eletronico = new Eletronico(nome, quantidade, valor);
                total = eletronico.calcularValorFinal(eletronico.getValor(), eletronico.getQuantidade());
            }
            if (item.getClass() == Movel.class) {
                nome = ((Movel) item).getNome();
                valor = ((Movel) item).getValor();
                quantidade = ((Movel) item).getQuantidade();
                Movel movel = new Movel(nome, quantidade, valor);
                total = movel.calcularValorFinal(movel.getValor(), movel.getQuantidade());
            }
            if (item.getClass() == Produto.class) {
                nome = ((Produto) item).getNome();
                valor = ((Produto) item).getValor();
                quantidade = ((Produto) item).getQuantidade();
                Produto produto = new Produto(nome, quantidade, valor);
                total = produto.calcularValorFinal(produto.getValor(), produto.getQuantidade());
            }
            totalGeral += total;
            System.out.println(nome + " R$" + valor + "   " + quantidade + "unid      Total R$" + total);
        }
        System.out.println(totalGeral);
    }

}

public class Movel extends Produto {

    public Movel (String nome, int quantidade, double valor) {
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setValor(valor);
    }

    public Movel(Produto produto) {
        this.setNome(produto.getNome());
        this.setQuantidade(produto.getQuantidade());
        this.setValor(produto.getValor());
    }
    public double calcularValorFinal(double valor, int quantidade){
        if (quantidade < 10)
            return (valor * quantidade)*1.11;
        else return (valor * quantidade)*1.05;
    }
}


public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(){}

    public Produto (String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorFinal(double valor, int quantidade){
        double valorTotal = (valor * quantidade)*1.10;
        return valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

public class Eletronico extends Produto {

    public Eletronico (String nome, int quantidade, double valor) {
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setValor(valor);
    }
    public Eletronico(Produto produto) {
        this.setNome(produto.getNome());
        this.setQuantidade(produto.getQuantidade());
        this.setValor(produto.getValor());
    }

    public double calcularValorFinal(double valor, int quantidade){
        double valorTotal = (valor * quantidade)*1.15;
        return valorTotal;
    }
}

