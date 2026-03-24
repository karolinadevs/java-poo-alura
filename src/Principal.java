public class Principal {
    public static void main(String[] args) {
        //Filme: guarda onde o objeto está. new Filme: cria o objeto.
        Filme meuFilme = new Filme(); //tipo: referencia

        //"." é para acessar algo de alguem
        //instanciação (criar um objeto com suas proprias caracteristicas)
        meuFilme.nome = "Terrifier";
        meuFilme.anoDeLancamento = 2016;
        meuFilme.duracaoEmMinutos = 84;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.mediaDasAvaliacoes());

        //classe pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        //classe calculadora
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        //classe musica
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
