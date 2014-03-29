package aula20130329.composite.p1;

public class Venda {
    private final Double valor;
    private CalculoDeComissao calculoDeComissao;

    public Venda(Double valor) {
        this.valor = valor;
        this.calculoDeComissao = new CalculoNull();
    }

    public void setCalculoDeComissao(CalculoDeComissao calculoDeComissao) {
        if (calculoDeComissao == null) {
            throw new RuntimeException("O CálculoDeComissão não pode ser nulo!");
        }
        this.calculoDeComissao = calculoDeComissao;
    }
    
    public Double getValor() {
        return valor;
    }

    public Double getComissao() {                
        //Teste de nulo removido pois agora usamos o pattern NullObject
        /*
        if (this.calculoDeComissao == null) {
            return 0.00;
        }
        */                
        return this.calculoDeComissao.calcularComissao(this);
    }
    
    
}


