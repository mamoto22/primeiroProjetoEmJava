public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){

            System.out.println("LANÇAMENTO QUE OS CLIENTES ESTÃO CURTINDO");
        } else{
            System.out.println("FILME RETRO QUE VALE APENA ASSISTIR");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else{
            System.out.println("Deve pagar o plano Plus");
        }

    }

}
