package aula20130329.composite.p1;

public class CalculoGeneroso implements CalculoDeComissao {

    public Double calcularComissao(Venda venda) {
        return venda.getValor() * 0.10;
    }
    
}
