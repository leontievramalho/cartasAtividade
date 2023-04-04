package br.edu.fesfafic.cartas.Model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    public String nome;
    public List<String> cartas;

    public Jogador(String nome) {
        this.nome = nome;
        this.cartas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getCartas() {
        return cartas;
    }
    public void addCarta(String carta){
        this.cartas.add(carta);
    }
    public void removeCarta(String carta){
        this.cartas.remove(carta);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", cartas=" + cartas +
                '}';
    }
}
