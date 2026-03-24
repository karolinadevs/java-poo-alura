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
    }
}
