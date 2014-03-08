/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130308.singleton.p2;

/**
 *
 * @author Arthur
 */
public class Universo {
    private static Universo instancia;
    
    private Universo() {
        
    }
    public synchronized static Universo getInstance() {
        if (instancia == null) {
            instancia = new Universo();
        }
        return instancia;
    }
    
}
