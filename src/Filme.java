//definição de uma classe, tudo o que uma classe tem e tudo o que faz.

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;

    //selecionar um atributo e dar shift + f6, renomeia em todas as vezes que ele aparecer
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lancamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
    }

}
