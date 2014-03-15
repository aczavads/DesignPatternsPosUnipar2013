package aula20130315.strategy.p2;

public class EstrategiaDeCalculoSoFixo implements EstrategiaCalculoFP {

    public DemonstrativoFP calcularPagamento(BaseCalculoFP baseFP) {
        return new DemonstrativoFP(
                2000, 
                2, 
                baseFP.getSalarioFixo()*0.15, 
                0.00, 
                baseFP);
    }
    
}
