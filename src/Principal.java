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
        System.out.println("total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.somaDasAvaliacoes = 1;
        System.out.println(meuFilme.pegaMedia());

    }
}
