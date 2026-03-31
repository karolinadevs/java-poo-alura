//import é a forma que uma classe se referencia a outra quando estão em pacotes diferentes
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //br.com.alura.screenmatch.modelos.Filme: guarda onde o objeto está. new br.com.alura.screenmatch.modelos.Filme: cria o objeto.
        Filme meuFilme = new Filme(); //tipo: referencia

        //"." é para acessar algo de alguem
        //instanciação (criar um objeto com a suas proprias caracteristicas)
        meuFilme.setNome("Terrifier");
        meuFilme.setAnoDeLancamento(2016);
        meuFilme.setDuracaoEmMinutos(84);

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

