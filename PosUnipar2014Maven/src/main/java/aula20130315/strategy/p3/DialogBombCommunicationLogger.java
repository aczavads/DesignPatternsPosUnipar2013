package aula20130315.strategy.p3;

import javax.swing.JOptionPane;

public class DialogBombCommunicationLogger implements BombCommunicationLogger {

    public void notificarBombaArmada() {
        JOptionPane.showMessageDialog(null, System.nanoTime() + ", armada!");
    }

    public void notificarBombaDesarmada() {
        JOptionPane.showMessageDialog(null, System.nanoTime() + ", desarmada!");
    }

    public void notificarBombaDetonada() {
        JOptionPane.showMessageDialog(null, System.nanoTime() + ", detonada!");
    }
    
    
    
}
