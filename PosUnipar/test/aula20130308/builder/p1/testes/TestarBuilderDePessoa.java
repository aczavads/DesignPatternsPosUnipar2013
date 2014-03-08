package aula20130308.builder.p1.testes;

import aula20130308.builder.p1.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur
 */
public class TestarBuilderDePessoa {
    
    public TestarBuilderDePessoa() {
    }
    
     @Test
     public void testarContrutorDePessoa() {
         Pessoa p = new Pessoa("Fulano",null, null);
         assertNotNull("Pessoa não deve ser nula!", p);
     }
     @Test
     public void testarBuilderDePessoa() {
//         Pessoa p = (new Pessoa.Builder())
//                 .mae(null)
//                 .nome("Fulano")
//                 .pai(null)
//                 .build();
         Pessoa p = (new Pessoa.BuilderComNome("Fulano")).build();
         
         assertEquals("Nome dever ser Fulano!","Fulano", p.getNome());
     }
}








