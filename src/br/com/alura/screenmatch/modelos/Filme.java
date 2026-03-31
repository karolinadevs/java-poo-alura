//encapsulamento

package br.com.alura.screenmatch.modelos;

//definição de uma classe, tudo o que uma classe tem e tudo o que faz.
public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    //selecionar um atributo e dar shift + f6, renomeia em todas as vezes que ele aparecer

    //atributo privado: variavel numa classe que so poder ser
    //acessada e modificada pelos metodos da propria classe

    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //getter
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //getter: busca valor
    //setter: inclui valor

    //alt + insert: atalho que possibilita a geração de um metodo

    //setter
    public void setNome(String nome) {
        //this referencia que indica a este "filme"
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

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

//todos os atributos precisam ser privados