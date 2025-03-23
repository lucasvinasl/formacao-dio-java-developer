package dio.processoseletivo;

import java.util.Random;

public class RH{

    public RH(){

    }

    public void ligarCandidato(String nomeCandidato) throws InterruptedException {
        int tentativasContato = 0;
        boolean contatoRealizado = false;

        while(tentativasContato < 3){
            if(candidatoAtender()){
                System.out.printf("CONSEGUIMOS CONTATO COM %s APÓS %d TENTATIVAS. %n", nomeCandidato, (tentativasContato+1));
                contatoRealizado = true;
                break;
            } else {
                System.out.println("Tentativa de contato "+ (tentativasContato+1) + "...");
                tentativasContato++;
            }
            Thread.sleep(1000);
        }

        if(!contatoRealizado){
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO:" + nomeCandidato);
        }

    }



    public boolean candidatoAtender(){

        return new Random().nextBoolean();
    }
}
