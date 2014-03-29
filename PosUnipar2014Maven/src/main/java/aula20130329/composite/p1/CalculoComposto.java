package aula20130329.composite.p1;

import java.util.ArrayList;
import java.util.List;

public class CalculoComposto implements CalculoDeComissao {
    private List<CalculoDeComissao> calculosDeComissão;

    public CalculoComposto() {
        this.calculosDeComissão = new ArrayList<CalculoDeComissao>();
    }
    public Double calcularComissao(Venda venda) {
        Double total = 0.00;
        for (CalculoDeComissao c : calculosDeComissão) {
            total += c.calcularComissao(venda);
        }
        return total;
    }
    public void addCalculoDeComissao(CalculoDeComissao c) {
        this.calculosDeComissão.add(c);
    }
}
