package aula20130329.composite.p1;

public class ComissaoGenerosa implements CalculoDeComissao {

    public Double calcularComissao(Venda venda) {
        return venda.getValor() * 0.10;
    }
    
}
