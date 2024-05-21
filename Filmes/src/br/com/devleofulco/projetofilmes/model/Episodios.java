package br.com.devleofulco.projetofilmes.model;

import br.com.devleofulco.projetofilmes.calculos.Classificar;

/**
 * Classe Episodios implementa a interface Classificar.
 * Esta classe representa um episódio individual de uma série dentro do projeto de gerenciamento de filmes e séries.
 * Inclui detalhes como número do episódio, nome, série a que pertence e total de visualizações.
 */
public class Episodios implements Classificar {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacoes;


    /**
     * Abaixo estão declarados os Getters e Setters responsáveis pela manipulação dos atributos
     * que serão consumidos nas classes.
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
    /**
     * Calcula a classificação do episódio com base no total de visualizações.
     * E retorna a classificação do episódio.
     */
    @Override
    public int getClassificacao() {
        // Classificação baseada no total de visualizações
        if (totalVisualizacoes > 1000){
            return 7; // Classificação alta
        } else if (totalVisualizacoes >= 100 && totalVisualizacoes <= 1000) {
            return 2;// Classificação média
        } else {
            return 1;// Classificação baixa
        }

    }
}
