package br.edu.fesfafic.cartas.Model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    public List<String> cartas;
    public String[] numCartas;
    public Jogador[] jogadores;

    public JogoCartas(String jogador1, String jogador2, String jogador3, String jogador4){
        this.numCartas = new String[13];
        this.numCartas[0] = "Ás";
        this.numCartas[1] = "Dois";
        this.numCartas[2] = "Três";
        this.numCartas[3] = "Quatro";
        this.numCartas[4] = "Cinco";
        this.numCartas[5] = "Seis";
        this.numCartas[6] = "Sete";
        this.numCartas[7] = "Oito";
        this.numCartas[8] = "Nove";
        this.numCartas[9] = "Dez";
        this.numCartas[10] = "Dama";
        this.numCartas[11] = "Valete";
        this.numCartas[12] = "Rei";

        this.cartas = new ArrayList<>();
        for(String carta: this.numCartas){
            this.cartas.add(carta + " de Paus");
            this.cartas.add(carta + " de Copas");
            this.cartas.add(carta + " de Ouro");
            this.cartas.add(carta + " de Espada");
        }
        this.jogadores = new Jogador[4];
        this.jogadores[0] = new Jogador(jogador1);
        this.jogadores[1] = new Jogador(jogador2);
        this.jogadores[2] = new Jogador(jogador3);
        this.jogadores[3] = new Jogador(jogador4);
    }

    public void embaralharCartas(){
        Collections.shuffle(this.cartas);
        System.out.println("Cartas embaralhadas.");
    }

    public void distribuirCartas(){
        for(Jogador jogador: this.jogadores){
            for(int i=0; i<13; i++) {
                jogador.addCarta(this.cartas.get(0));
                this.cartas.remove(0);
            }
            System.out.println(jogador);
        }
    }

    public void jogarCarta(int indiceJogador, String carta){
        boolean teste = false;
        for(String carta2 : this.jogadores[indiceJogador].getCartas()) {
            if (carta2.equals(carta)) {
                teste = true;
                break;
            }
        }
        if(teste){
            this.jogadores[indiceJogador].removeCarta(carta);
            System.out.println(this.jogadores[indiceJogador].getNome() + " jogou a carta " + carta);
        } else
            System.out.println("Você não possui essa carta.");
    }

    public List<String> getCartas() {
        return cartas;
    }

    public void setCartas(List<String> cartas) {
        this.cartas = cartas;
    }

    public String[] getNumCartas() {
        return numCartas;
    }

    public void setNumCartas(String[] numCartas) {
        this.numCartas = numCartas;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "JogoCartas{" +
                "cartas=" + cartas +
                ", jogadores=" + Arrays.toString(jogadores) +
                '}';
    }
}
