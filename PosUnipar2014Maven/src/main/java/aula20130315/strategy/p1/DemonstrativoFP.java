package aula20130315.strategy.p1;

public class DemonstrativoFP {
    private final int ano;
    private final int mes;
    private final double totalFixo;
    private final double totalVariavel;
    private final BaseCalculoFP baseDeCalculo;

    public DemonstrativoFP(int ano, int mes, double totalFixo, double totalVariavel, BaseCalculoFP baseDeCalculo) {
        this.ano = ano;
        this.mes = mes;
        this.totalFixo = totalFixo;
        this.totalVariavel = totalVariavel;
        this.baseDeCalculo = baseDeCalculo;
    }
    
    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public double getTotalFixo() {
        return totalFixo;
    }

    public double getTotalVariavel() {
        return totalVariavel;
    }

    public BaseCalculoFP getBaseDeCalculo() {
        return baseDeCalculo;
    }
    
    
    
}
