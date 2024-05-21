package br.com.devleofulco.projetofilmes.model;


/**
 * Classe Titulo representa um título de filme ou série dentro do projeto de gerenciamento de filmes.
 * Esta classe serve como base para armazenar informações comuns a todos os títulos, como nome, ano de lançamento,
 * e dados relacionados à avaliação dos usuários.
 */
public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    /**
     * Abaixo temos os Getters e Setters responsáveis por manipular os atributos
     * declarados na classe e que podem ser chamados nas classes filhas.
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    /**
     * Exibe a ficha técnica do título, incluindo nome, ano de lançamento, média de avaliações e total de avaliações.
     */
    public void exibeFichaTecnica(){
        System.out.println("Titulo: "+nome);
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        System.out.printf("Media de avaliações: %.2f \n", pegaMedia());
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);

    }

    /**
     * Adiciona uma avaliação ao título e atualiza a soma e o total de avaliações.
     * O parâmetro nota refere-se a nota da avaliação a ser adicionada.
     */
    void avaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    /**
     * Calcula a média das avaliações do título.
     * Retorna a média das avaliações.
     */
    double pegaMedia (){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
