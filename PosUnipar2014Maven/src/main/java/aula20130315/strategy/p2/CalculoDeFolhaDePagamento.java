package aula20130315.strategy.p2;

import java.util.ArrayList;
import java.util.List;

public class CalculoDeFolhaDePagamento {
    private EstrategiaCalculoFP estrategiaDeCalculo;

    public CalculoDeFolhaDePagamento(EstrategiaCalculoFP estrategiaDeCalculo) {
        this.estrategiaDeCalculo = estrategiaDeCalculo;
    }
    
    public List<DemonstrativoFP> calcular() {
        return new ArrayList<DemonstrativoFP>();
    }

    public List<DemonstrativoFP> calcular(BaseCalculoFP baseFP) {
        ArrayList<DemonstrativoFP> retorno = new ArrayList<DemonstrativoFP>();

        //retorno.add( new DemonstrativoFP(2000, 2, 1125, 750, null) );
        retorno.add( estrategiaDeCalculo.calcularPagamento(baseFP) );
        
        return retorno;
    }    
}
