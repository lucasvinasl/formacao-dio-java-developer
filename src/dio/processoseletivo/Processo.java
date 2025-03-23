package dio.processoseletivo;

import java.util.HashMap;
import java.util.Map;

public class Processo {

    private static final double SALARIO_BASE = 2000;
    private HashMap<String, Double> listaCandidatos = new HashMap<>();

    public Processo(){
        double salarioBase = SALARIO_BASE;
    }

    // Esse metodo não precisa mais
    public void ligarCandidato(double salarioPretendido){

        final double salarioBase = 2000;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }else {
            System.out.println("Aguardando resultado demais candidatos.");
        }
    }

    public void setListaCandidatos(HashMap<String, Double> candidatos){
        this.listaCandidatos.putAll(candidatos);
    }

    public HashMap<String, Double> getListaCandidatos(){
        return this.listaCandidatos;
    }

    public HashMap<String, Double> getCandidatosFiltrados(){

        HashMap<String, Double> candidatosFiltrados = new HashMap<>();

        for(Map.Entry<String, Double> candidato : listaCandidatos.entrySet()){
            if(candidato.getValue() <= SALARIO_BASE){
                candidatosFiltrados.put(candidato.getKey(), candidato.getValue());
            }

            if(candidatosFiltrados.size() == 2){
                break;
            }
        }

        return candidatosFiltrados;

    }








}
