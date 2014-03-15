package aula20130315.strategy.p2.testes;

import aula20130315.strategy.p2.testes.*;
import aula20130315.strategy.p2.BaseCalculoFP;
import aula20130315.strategy.p2.CalculoDeFolhaDePagamento;
import aula20130315.strategy.p2.DemonstrativoFP;
import aula20130315.strategy.p2.EstrategiaCalculoPadrao;
import aula20130315.strategy.p2.Pessoa;
import java.util.List;
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
public class TesteDeFolhaDePagamento {

    public TesteDeFolhaDePagamento() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testarFolhaSemBaseDeCalculo() {
        CalculoDeFolhaDePagamento calcFP = 
                new CalculoDeFolhaDePagamento(new EstrategiaCalculoPadrao());
        List<DemonstrativoFP> resultadoFolha = calcFP.calcular();
        assertEquals("O resultado deveria ser vazio!", 0, resultadoFolha.size());
    }

    @Test
    public void testarFolhaComBaseDeCalculoA() {
        CalculoDeFolhaDePagamento calcFP = 
                new CalculoDeFolhaDePagamento(new EstrategiaCalculoPadrao());

        final double salarioFixo = 7500;
        final double vendasNoMEs = 25000;
        final double comissao = 0.03;
        final double descontos = 0.15;
        final double fixoEsperado = salarioFixo * descontos;
        final double variavelEsperado = vendasNoMEs * comissao;

        BaseCalculoFP baseFP = new BaseCalculoFP(
                salarioFixo,
                vendasNoMEs,
                new Pessoa("Zé"));

        List<DemonstrativoFP> resultadoFolha = calcFP.calcular(baseFP);

        assertEquals("Deveria existir um demonstrativo!", 1, resultadoFolha.size());
        DemonstrativoFP demoFP = resultadoFolha.get(0);
        assertEquals("Valor fixo incorreto!", 
                fixoEsperado, 
                demoFP.getTotalFixo(), 
                0.00);
        assertEquals("Valor variável incorreto!", 
                variavelEsperado, 
                demoFP.getTotalVariavel(), 
                0.00);
    }
    @Test
    public void testarFolhaComBaseDeCalculoB() {
        CalculoDeFolhaDePagamento calcFP = 
                new CalculoDeFolhaDePagamento(new EstrategiaCalculoPadrao());

        final double salarioFixo = 5000;
        final double vendasNoMEs = 42000;
        final double comissao = 0.03;
        final double descontos = 0.15;
        final double fixoEsperado = salarioFixo * descontos;
        final double variavelEsperado = vendasNoMEs * comissao;

        BaseCalculoFP baseFP = new BaseCalculoFP(
                salarioFixo,
                vendasNoMEs,
                new Pessoa("Zé"));

        List<DemonstrativoFP> resultadoFolha = calcFP.calcular(baseFP);

        assertEquals("Deveria existir um demonstrativo!", 1, resultadoFolha.size());
        DemonstrativoFP demoFP = resultadoFolha.get(0);
        assertEquals("Valor fixo incorreto!", 
                fixoEsperado, 
                demoFP.getTotalFixo(), 
                0.00);
        assertEquals("Valor variável incorreto!", 
                variavelEsperado, 
                demoFP.getTotalVariavel(), 
                0.00);
    }
}
