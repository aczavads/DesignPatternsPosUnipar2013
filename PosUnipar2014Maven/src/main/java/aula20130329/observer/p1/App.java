package aula20130329.observer.p1;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends JFrame {
    private JButton btnOK = new JButton("Ok");
    
    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }

    public App() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(200,150);
        this.add(this.btnOK);
        
        ActionListener al1 = new MeuTratamentoDeAcoesDoBotaoOK();
        
        ActionListener al2 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Outra mensagem!");
            }            
        };

        this.btnOK.addActionListener(al1);
        this.btnOK.addActionListener(al2);

    }
    
    
}

