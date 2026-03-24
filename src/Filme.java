//definição de uma classe, tudo o que uma classe tem e tudo o que faz.

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lancamento: " + anoDeLancamento);
    }

}
