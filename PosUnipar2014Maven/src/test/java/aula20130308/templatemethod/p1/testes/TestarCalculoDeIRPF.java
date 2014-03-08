package aula20130308.templatemethod.p1.testes;

import aula20130308.templatemethod.p1.CalcularIRPF2014;
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
public class TestarCalculoDeIRPF {
    
    public TestarCalculoDeIRPF() {
    }
    
     @Test
     public void testarCalculoDoImposto() {
         CalcularIRPF2014 calc = new CalcularIRPF2014() {
             @Override 
             public boolean estahDentroDoPrazo(int ano) {
                 return true;
             }
             @Override
             public double recuperarBaseDeCalculo() {
                 return 202.00;
             }
             @Override
             public double recuperarAliquota(double baseDeCalculo) {
                 return 10;
             }
         };
         double impostoDevido = calc.calcularValorDevido();
         assertEquals("Cálculo do imposto errado!", 20.2, impostoDevido, 0.01);
     }
}