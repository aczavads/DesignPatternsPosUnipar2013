package aula20130329.composite.p1.testes;

import aula20130329.composite.p1.CalculoComposto;
import aula20130329.composite.p1.CalculoGeneroso;
import aula20130329.composite.p1.Venda;
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
public class TesteDeCalculoDeComissaoComposto {
    private static Venda primeiraVenda;
    
    public TesteDeCalculoDeComissaoComposto() {
    }
    
    @Before
    public void before() {
        primeiraVenda = new Venda(200.20);
    }
    
     @Test
     public void testarCalculoComissaoSemEstrategia() {
         //primeiraVenda.setCalculoDeComissao(null);
         Double comissao = primeiraVenda.getComissao();
         assertEquals("O valor da comissão deveria ser zero!", 0.00, comissao, 0.00);
     }
     @Test
     public void testarCalculoComissaoGenerosa() {
         primeiraVenda.setCalculoDeComissao(new CalculoGeneroso());
         Double comissao = primeiraVenda.getComissao();
         assertEquals("O valor da comissão deveria ser zero!", 
                 primeiraVenda.getValor()*0.1, 
                 comissao, 
                 0.00);
     }
     @Test
     public void testarCalculoComissaoComposto() {
         CalculoComposto cc = new CalculoComposto();
         cc.addCalculoDeComissao(new CalculoGeneroso());
         cc.addCalculoDeComissao(new CalculoGeneroso());
         cc.addCalculoDeComissao(new CalculoGeneroso());
         
         primeiraVenda.setCalculoDeComissao(cc);
         
         Double comissao = primeiraVenda.getComissao();
         assertEquals("O valor da comissão deveria ser zero!", 
                 primeiraVenda.getValor()*0.3, 
                 comissao, 
                 0.01);
     }
}
