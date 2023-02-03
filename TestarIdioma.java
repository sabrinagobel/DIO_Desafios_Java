public class TestarIdioma {
    public static void main(String[] args) {
        Portugues portugues = new Portugues();
        Ingles ingles = new Ingles();
        Hungaro hungaro = new Hungaro();
        Tcheco tcheco = new Tcheco();

        portugues.saudacao();
        ingles.saudacao();
        hungaro.saudacao();
        tcheco.saudacao();
    }
}

abstract class Idioma {
    private String nomeDoIdioma;

    abstract void saudacao();

    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }
}

public class Tcheco extends Idioma {

    final String nomeDoIdioma = "Tcheco";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Ahoj Svete");
    }
}

public class Ingles extends Idioma {
    final String nomeDoIdioma = "Inglês";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Hello World");
    }
}

public class Portugues extends Idioma {
    final String nomeDoIdioma = "Português";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Olá Mundo");
    }
}

public class Hungaro extends Idioma {
    final String nomeDoIdioma = "Húngaro";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Helló Világ");
    }
}



