package br.com.devleofulco.projetofilmes.model;

import br.com.devleofulco.projetofilmes.calculos.Classificar;

/**
 * Classe Filmes, que estende a classe Titulo e implementa a interface Classificar.
 * Esta classe representa um filme dentro do projeto de gerenciamento de filmes.
 * Inclui detalhes específicos do filme, como diretor, gênero, duração e tipo.
 */
public class Filmes extends Titulo implements Classificar {
    private String diretor;
    private String genero;
    private int duracaoEmMinutos;
    public String tipo;


    /**
     * Obtém o nome do diretor do filme.
     * E retorna o nome do diretor.
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * Define o nome do diretor do filme.
     * Permite que informe o nome do diretor a ser atribuído ao filme.
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * Obtém o gênero do filme.
     * E retorna o gênero do filme.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o gênero do filme.
     * Permite que seja informado o gênero a ser atribuído ao filme.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtém a duração do filme em minutos.
     * E retorna a duração do filme.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    /**
     * Define a duração do filme em minutos.
     * Permite que seja informado a duração a ser atribuída ao filme.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Exibe a ficha técnica do filme, incluindo informações da superclasse Titulo.
     */
    @Override
    public void exibeFichaTecnica (){
        super.exibeFichaTecnica();

        System.out.println("Tipo: "+ tipo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Genero: "+ genero);
        System.out.println("Duração: "+ duracaoEmMinutos + " min" );
    }

    /**
     * Calcula a classificação do filme com base na média obtida pela interface Classificar.
     * Ao final, retorna a classificação do filme.
     */
    @Override
    public int getClassificacao() {
        return (int) pegaMedia();
    }
}
