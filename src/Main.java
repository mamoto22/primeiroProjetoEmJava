import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Sreen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10.0;
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media /2);

        System.out.println("Classificação " + classificacao + " Estrelas ");
    }
} 