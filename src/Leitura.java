import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = entrada.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = entrada.nextInt();
        System.out.println("Diga a sua nota para o filme");
        double avaliacao = entrada.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
