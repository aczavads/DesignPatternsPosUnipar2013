package aula20130315.strategy.p3;

public class App {
    
    public static void main(String[] args) {
        Bomb b1 = new Bomb();
        //exemplo de Null Object com classe anônima
        /*
        BombCommunicationLogger bcl = new BombCommunicationLogger() {
            public void notificarBombaArmada() {
            }
            public void notificarBombaDesarmada() {
            }
            public void notificarBombaDetonada() {
            }
        };
        b1.setLogger(bcl);
        */
        //b1.setLogger(new NullBombCommunicationLogger());
        //b1.setLogger(new ConsoleBombCommunicationLogger());
        b1.setLogger(new DialogBombCommunicationLogger());
        b1.armar();
        b1.desarmar();
        b1.armar();
        b1.detonar();
        b1.armar();
    }
    
}
