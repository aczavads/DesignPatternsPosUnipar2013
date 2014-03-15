package aula20130315.abstracoesComAssociacoes.testes;

import aula20130315.abstracoesComAssociacoes.PincelModeloAzul;
import aula20130315.abstracoesComAssociacoes.PincelModeloPreto;
import aula20130315.abstracoesComAssociacoes.PincelModeloVermelho;
import aula20130315.abstracoesComAssociacoes.TampaDePincel;
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
public class TestarTampaComPinceis {    
    private TampaDePincel tampa;
    
    public TestarTampaComPinceis() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tampa = new TampaDePincel();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void testarTampaComPincelAzul() {
         tampa.setPincel(new PincelModeloAzul());
         assertTrue(tampa.toString().contains("PincelModeloAzul"));
     }
     @Test
     public void testarTampaComPincelPreto() {
         tampa.setPincel(new PincelModeloPreto());
         assertTrue(tampa.toString().contains("PincelModeloPreto"));
     }
     @Test
     public void testarTampaComPincelVermelho() {
         tampa.setPincel(new PincelModeloVermelho());
         assertTrue(tampa.toString().contains("PincelModeloVermelho"));
     }
}
