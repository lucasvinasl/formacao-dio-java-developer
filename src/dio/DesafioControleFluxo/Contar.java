package dio.DesafioControleFluxo;

public class Contar {

    public static void validar(int param1, int param2) throws ParametrosInvalidosException {
        if(param1 > param2)
            throw new ParametrosInvalidosException();

        int iteracoes = param2 - param1;

        for(int i = 0; i < iteracoes; i++){
            System.out.println("Imprimindo o número " +i);
        }

    }
}
