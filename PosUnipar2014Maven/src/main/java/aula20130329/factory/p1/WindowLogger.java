package aula20130329.factory.p1;

import javax.swing.JOptionPane;

public class WindowLogger implements Logger {

    public void log(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
    
}
