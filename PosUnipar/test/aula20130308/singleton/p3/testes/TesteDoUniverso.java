package aula20130308.singleton.p3.testes;

import aula20130308.singleton.p3.testes.*;
import aula20130308.singleton.p3.Universo;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur
 */
public class TesteDoUniverso {
    
    public TesteDoUniverso() {
    }
    
    @Test
    public void testarSeUnviversoEhSingleton() {
        //Universo u1 = new Universo();
        //Universo u2 = new Universo();
        Universo u1 = Universo.criarUniverso();
        Universo u2 = Universo.criarUniverso();
        assertSame(
                "As referências para Universo deveriam"
                + " apontar para a mesma instância!",
                u1, u2);
    }
    @Test
    public void testarSeUnviversoEhSingletonUsandoSet() {
        Set<Universo> universos = new HashSet<Universo>();
        for (int i = 0; i < 100; i++) {
            universos.add( Universo.criarUniverso() );
        }
        assertEquals("Só deveria existir UM!", 1, universos.size());
    }
}