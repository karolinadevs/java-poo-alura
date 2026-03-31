package br.com.alura.screenmatch.modelos;

//definição de uma classe, tudo o que uma classe tem e tudo o que faz.
public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;

    //selecionar um atributo e dar shift + f6, renomeia em todas as vezes que ele aparecer

    //atributo privado: variavel numa classe que so poder ser
    //acessada e modificada pelos metodos da propria classe

    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lancamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        //toda vez que tiver uma avaliacao, ele vai somar +1.
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
