import br.com.devleofulco.projetofilmes.calculos.FiltroRecomendacao;
import br.com.devleofulco.projetofilmes.model.Episodios;
import br.com.devleofulco.projetofilmes.model.Filmes;
import br.com.devleofulco.projetofilmes.model.Series;

public class Main {
    public static void main(String[] args) {

        Filmes primeiroFilme = new Filmes();
        Series primeiraSerie = new Series();

        primeiroFilme.setNome("Deadpoll");
        primeiroFilme.setAnoDeLancamento(2017);
        primeiroFilme.setDuracaoEmMinutos(130);
        primeiroFilme.setSomaDasAvaliacoes(35000);
        primeiroFilme.setTotalDeAvaliacoes(4500);
        primeiroFilme.setGenero("Ficção");
        primeiroFilme.setDiretor("Fulaninho");
        primeiroFilme.setTipo("Filme");

        primeiroFilme.exibeFichaTecnica();
        System.out.println("------------------------------");


        primeiraSerie.setNome("Suits");
        primeiraSerie.setAtiva(true);
        primeiraSerie.setTemporadas(8);
        primeiraSerie.setAnoDeLancamento(2020);
        primeiraSerie.setEpisodiosPorTemporada(10);
        primeiraSerie.setMinutosPorEpisodio(45);
        primeiraSerie.setTipo("Serie");
        primeiraSerie.setSomaDasAvaliacoes(152000);
        primeiraSerie.setTotalDeAvaliacoes(16500);
        primeiraSerie.exibeFichaTecnica();
        System.out.println("--------------------------------------");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtraPorRecomendacao(primeiroFilme);


        Episodios episodio = new Episodios();
        episodio.setNumero(8);
        episodio.setNome("The Choice");
        episodio.setSerie(primeiraSerie.getNome());
        episodio.setTotalVisualizacoes(1001);
        filtro.filtraPorRecomendacao(episodio);





    }
}