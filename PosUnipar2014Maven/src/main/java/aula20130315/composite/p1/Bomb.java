package aula20130315.composite.p1;

public class Bomb {

    private boolean armada;
    private boolean detonada;
    private BombCommunicationLogger logger;

    public void setLogger(BombCommunicationLogger logger) {
        this.logger = logger;
    }

    public Bomb() {
        this.armada = false;
        this.detonada = false;
    }

    public void armar() {
        if (!armada && !detonada) {
            this.armada = true;
            this.detonada = false;
            //if (this.logger != null) {
            this.logger.notificarBombaArmada();
            //}
        }
    }

    public void desarmar() {
        if (armada && !detonada) {
            this.armada = false;
            //if (this.logger != null) {
            this.logger.notificarBombaDesarmada();
            //}
        }
    }

    public void detonar() {
        if (!detonada && armada) {
            this.detonada = true;
            //if (this.logger != null) {
            this.logger.notificarBombaDetonada();
            //}
        }
    }

}
