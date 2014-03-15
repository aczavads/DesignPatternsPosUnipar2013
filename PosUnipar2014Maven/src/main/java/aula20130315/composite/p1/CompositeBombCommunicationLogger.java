package aula20130315.composite.p1;

import java.util.ArrayList;
import java.util.List;

public class CompositeBombCommunicationLogger implements BombCommunicationLogger {
    private List<BombCommunicationLogger> loggers = new ArrayList<BombCommunicationLogger>();

    public void notificarBombaArmada() {
        for (BombCommunicationLogger logger : loggers) {
            logger.notificarBombaArmada();
        }
    }
    public void notificarBombaDesarmada() {
        for (BombCommunicationLogger logger : loggers) {
            logger.notificarBombaDesarmada();
        }
    }
    public void notificarBombaDetonada() {
        for (BombCommunicationLogger logger : loggers) {
            logger.notificarBombaDetonada();
        }
    }
    public void addLogger(BombCommunicationLogger bcl) {
        this.loggers.add(bcl);
    }
}
