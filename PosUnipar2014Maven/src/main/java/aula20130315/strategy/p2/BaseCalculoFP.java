package aula20130315.strategy.p2;

public class BaseCalculoFP {
    private final double salarioFixo;
    private final double totalVendasNoMes;
    private final Pessoa pessoa;

    public BaseCalculoFP(double salarioFixo, double totalVendasNoMes, Pessoa pessoa) {
        this.salarioFixo = salarioFixo;
        this.totalVendasNoMes = totalVendasNoMes;
        this.pessoa = pessoa;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getTotalVendasNoMes() {
        return totalVendasNoMes;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    
    
    
    
    
    
}
