package br.com.devleofulco.projetofilmes.calculos;

/**
 * Classe FiltroRecomendacao é responsável por filtrar títulos (filmes, séries, episódios)
 * com base em sua classificação e fornecer recomendações.
 */
public class FiltroRecomendacao {
    // Constantes que definem os limiares de classificação
    private static final int CLASSIFICACAO_ALTA = 7;
    private static final int CLASSIFICACAO_MEDIA = 2;

    // Mensagens constantes para diferentes níveis de recomendação
    private static final String MENSAGEM_TOP_RECOMENDACOES = "Esta entre os Top 10 em recomendações";
    private static final String MENSAGEM_AVALIACAO_REGULAR = "Avaliação regular!";
    private static final String MENSAGEM_BAIXA_AVALIACAO = "Baixa avaliação no momento!";

    /**
     * Filtra títulos por recomendação com base na classificação e exibe uma mensagem correspondente.
     * O parâmetro classicar significa que a entidade que implementa a interface Classificar e possui uma classificação.
     */
    public void filtraPorRecomendacao(Classificar classificar){
        // Obtém a classificação da entidade
        int classificacao = classificar.getClassificacao();
        // Compara a classificação com os limiares definidos e exibe a mensagem apropriada
        if (classificacao >= CLASSIFICACAO_ALTA){
            System.out.println(MENSAGEM_TOP_RECOMENDACOES);
        } else if (classificacao >= CLASSIFICACAO_MEDIA && classificacao < CLASSIFICACAO_ALTA){
            System.out.println(MENSAGEM_AVALIACAO_REGULAR);
        } else {
            System.out.println(MENSAGEM_BAIXA_AVALIACAO);
        }
    }

}
