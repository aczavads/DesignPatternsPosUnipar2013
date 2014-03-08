/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130308.singleton.p3;

import aula20130308.singleton.p2.*;

/**
 *
 * @author Arthur
 */
public class Universo {
    private static Universo[] instancias = new Universo[4];
    
    private Universo() {
        
    }
    public synchronized static Universo criarUniverso() {
        int pos = (int)(System.nanoTime()%4);
        System.out.println(">> universo: " + pos);
        if (instancias[pos] == null) {
            instancias[pos] = new Universo();
        }
        return instancias[pos];
    }
    
}
