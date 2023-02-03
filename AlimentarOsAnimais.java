package Animal;

public class AlimentarOsAnimais {
    public static void main (String[] args) {
        Gato coca = new Gato("Coca", 20);
        Gato foxy = new Gato("Foxy", 3);
        Cachorro einstein = new Cachorro("Einstein", 10);
        Gato edward = new Gato("Edward", 5);

        System.out.println("Coca come " + coca.quantidadeDeRacao() + " gramas");
        System.out.println("Foxy come " + foxy.quantidadeDeRacao() + " gramas");
        System.out.println("Einstein come " + einstein.quantidadeDeRacao() + " gramas");
        System.out.println("Edward come " + edward.quantidadeDeRacao() + " gramas");

        System.out.println("Soma da ração consumida por todos os animais: " +
                (
                        coca.quantidadeDeRacao() +
                        foxy.quantidadeDeRacao() +
                        einstein.quantidadeDeRacao() +
                        edward.quantidadeDeRacao()
                )
        + " gramas");
    }
}

public class Gato extends Animal {


    public Gato(String nome, float peso) {
        super();
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    String som() {
        return "miau";
    }

    @Override
    double quantidadeDeRacao() {

        if (this.peso <= 4)
            this.quantidadeDeRacao = (this.peso * 12);
        else this.quantidadeDeRacao = (this.peso * 15);
        return quantidadeDeRacao;
    }
}

public class Cachorro extends Animal {

    public Cachorro(String nome, float peso) {
        super();
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    String som() {
        return "auau";
    }

    @Override
    double quantidadeDeRacao() {
        if (this.peso <= 3)
            this.quantidadeDeRacao = (this.peso * 35);
        else if (peso > 3 && peso <=10)
            quantidadeDeRacao = (peso * 45);
        else
            this.quantidadeDeRacao = (this.peso * 50);
        return quantidadeDeRacao;
    }
}


