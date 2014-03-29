package aula20130308.builder.p2.testes;

import aula20130308.builder.p2.ConexaoBD;
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
public class TestarBuilderDeConexaoBD {
    
    public TestarBuilderDeConexaoBD() {
    }
    
     //@Test
     public void testarConexao() {
         ConexaoBD c = (new ConexaoBD.Builder())
                 .user("postgres")
                 .password("postgres")
                 .driver("jdbc:postgresql")
                 .server("localhost")
                 .port(5432)
                 .database("posunipar")
                 .build();  
         assertNotNull(c);         
         assertFalse(c.isClosed());
     }
     //@Test
     public void testarConexaoComSubclasseParaPostgreSQL() {
         ConexaoBD c = (new ConexaoBD.BuilderPostgreSQL()).build();  
         assertNotNull(c);         
         assertFalse(c.isClosed());
     }
}