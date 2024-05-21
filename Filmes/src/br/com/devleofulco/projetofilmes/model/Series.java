package br.com.devleofulco.projetofilmes.model;

import br.com.devleofulco.projetofilmes.calculos.Classificar;

public class Series extends Titulo implements Classificar{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private int duracaoEmMinutos;
    private String tipo;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica(); // Chama o método da classe pai primeiro

        System.out.println("Tipo: "+ tipo);
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Ativa: " + (ativa ? "Sim" : "Não"));
        System.out.println("Duração total da série: " + getDuracaoEmMinutos() + " min");
        System.out.println("Minutos por episodio: "+ minutosPorEpisodio);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
    }


    @Override
    public int getClassificacao() {
        return 0;
    }
}
