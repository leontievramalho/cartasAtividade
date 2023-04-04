package br.edu.fesfafic.cartas.Main;

import br.edu.fesfafic.cartas.Model.JogoCartas;

public class Main {
    public static void main(String[] args){
        JogoCartas sueca = new JogoCartas("Leontiev", "Tercia", "Louise", "Alice");
        sueca.embaralharCartas();
        sueca.distribuirCartas();
        sueca.jogarCarta(0, "Oito de Ouro");

    }

}
