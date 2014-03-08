package aula20130308.singleton.p3.testes;

import aula20130308.singleton.p3.Universo;
import java.util.HashSet;
import java.util.Set;
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
    public void testarSeUnviversoEhSingletonComNoMaximoQuatroInstâncias() {
        Set<Universo> universos = new HashSet<Universo>();
        for (int i = 0; i < 100; i++) {
            universos.add( Universo.getInstance() );
        }
        assertTrue("Só podem existir no máximo 4 universos!", 4 <= universos.size());
    }
}