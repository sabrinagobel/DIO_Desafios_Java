package Futebol;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class JogadorFutebol {
    String nome;
    String posicao;
    LocalDate dataNascimento = LocalDate.of(2010,8,17);


    int idade = calculaIdade();
    int tempoAposentadoria;

    public static void main(String[] args) {
        JogadorFutebol jogadorFutebol = new JogadorFutebol();
        jogadorFutebol.nome = "Maria";
        jogadorFutebol.posicao = "defesa";
        jogadorFutebol.dataNascimento = LocalDate.of(2015,5,1);

        jogadorFutebol.idade = jogadorFutebol.calculaIdade();
        jogadorFutebol.tempoAposentadoria = jogadorFutebol.calculaTempoAposentadoria();
        jogadorFutebol.imprimeDados();

    }

    public void imprimeDados() {
        System.out.println( "Nome do jogador: " + nome +
                            "\nPosição: " + posicao +
                            "\nData de nascimento: " + dataNascimento +
                            "\nIdade: " + idade + " anos" +
                            "\nTempo aposentadoria: " + tempoAposentadoria + " anos");
    }

    public int calculaIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int calculaTempoAposentadoria(){
        if (posicao.equals("defesa")) return 40-idade;
        if (posicao.equals("meio-campo")) return 38-idade;
        else return 35-idade;
    }

}




/*
Crie uma classe para representar um jogador de futebol, com os atributos nome,
posição, data de nascimento.

Crie o método para imprimir todos os dados do jogador.

Crie um método para calcular a idade do jogador e outro método para mostrar quanto
tempo falta para o jogador se aposentar.

Para isso, considere que os jogadores da
posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo
aos 38 e os atacantes aos 35
 */
