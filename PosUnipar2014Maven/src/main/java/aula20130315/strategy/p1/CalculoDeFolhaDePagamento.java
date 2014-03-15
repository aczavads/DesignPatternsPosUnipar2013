package aula20130315.strategy.p1;

import java.util.ArrayList;
import java.util.List;

public class CalculoDeFolhaDePagamento {

    public List<DemonstrativoFP> calcular() {
        return new ArrayList<DemonstrativoFP>();
    }

    public List<DemonstrativoFP> calcular(BaseCalculoFP baseFP) {
        ArrayList<DemonstrativoFP> retorno = new ArrayList<DemonstrativoFP>();

        //retorno.add( new DemonstrativoFP(2000, 2, 1125, 750, null) );
        retorno.add( calcularPagamento(baseFP) );
        
        return retorno;
    }

    private DemonstrativoFP calcularPagamento(BaseCalculoFP baseFP) {
        return new DemonstrativoFP(
                2000, 
                2, 
                baseFP.getSalarioFixo()*0.15, 
                baseFP.getTotalVendasNoMes()*0.03, 
                baseFP);
    }
    
}
