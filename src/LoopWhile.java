import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while(nota != -1){
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar ");
            nota = entrada.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }

        System.out.println("Media de avaliações " + mediaAvaliacao/3);
    }
}
