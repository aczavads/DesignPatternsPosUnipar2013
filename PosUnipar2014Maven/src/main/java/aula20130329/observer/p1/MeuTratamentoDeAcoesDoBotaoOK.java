package aula20130329.observer.p1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class MeuTratamentoDeAcoesDoBotaoOK implements ActionListener {

    public MeuTratamentoDeAcoesDoBotaoOK() {
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "O botão OK foi pressionado!");
    }
    
}
