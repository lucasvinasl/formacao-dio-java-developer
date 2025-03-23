package dio.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o parâmetro 1: ");
        int param1 = scan.nextInt();

        System.out.println("Informe o parâmetro 2: ");
        int param2 = scan.nextInt();

        try{
            Contar.validar(param1, param2);
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }

    }
}
