package dio.processoseletivo;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        Processo processo = new Processo();
        RH rh = new RH();
        HashMap<String, Double> candidatos = new HashMap<>();


        System.out.println("<!------# Processo Seletivo #------!>");
        System.out.println("<!------# Cadastro de Candidatos #------!> ");
        boolean paradaCadastro = false;

        while(paradaCadastro == false){
            System.out.println("Informe o Nome do Candidato: ");
            String nomeCandidato = scan.nextLine();

            System.out.println("Informe o Salário Pretendido: ");
            double salarioPretendido = scan.nextDouble();
            scan.nextLine();

            candidatos.put(nomeCandidato, salarioPretendido);
            processo.setListaCandidatos(candidatos);

            System.out.println("Deseja cadastrar mais candidatos? (S/N)");
            String resposta = scan.nextLine();

            if(resposta.equalsIgnoreCase("N")){
                paradaCadastro = true;
            }

        }

        System.out.println("<!------# Lista de Candidatos TOTAIS #------!>");
        for(var c : processo.getListaCandidatos().entrySet()){
            System.out.println(c.getKey() + " - Salário Pretendido: R$ " + c.getValue());
        }
        System.out.println("<!------#                            #------!>");

        System.out.println("<!------# Lista de Candidatos SELECIONADOS #------!>");
        for(var c : processo.getCandidatosFiltrados().entrySet()){
            System.out.println(c.getKey() + " - Salário Pretendido: R$ " + c.getValue());
        }
        System.out.println("<!------#                            #------!>");

        System.out.println("<!------# Entrando em Contato com os Candidatos SELECIONADOS #------!>");
        for(var c: processo.getCandidatosFiltrados().entrySet()){
            System.out.println("#--- Ligando para o candidato: " + c.getKey() + " ---#");
            rh.ligarCandidato(c.getKey());
        }


    }
}
