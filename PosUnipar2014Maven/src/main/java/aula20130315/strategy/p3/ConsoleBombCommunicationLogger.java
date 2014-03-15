package aula20130315.strategy.p3;

public class ConsoleBombCommunicationLogger implements BombCommunicationLogger{

    public void notificarBombaArmada() {
        System.out.println(System.nanoTime()+ 
                " ==> Cuidado, a bomba foi armada!!");
    }

    public void notificarBombaDesarmada() {
        System.out.println(System.nanoTime()+ 
                " ==> Ufa, bomba desarmada!");
    }

    public void notificarBombaDetonada() {
        System.out.println(System.nanoTime()+ 
                " ==> Foi detonada!");
    }
    
}
