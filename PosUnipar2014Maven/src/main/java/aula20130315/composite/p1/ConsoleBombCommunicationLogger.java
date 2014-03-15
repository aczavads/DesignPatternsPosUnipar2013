package aula20130315.composite.p1;

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
