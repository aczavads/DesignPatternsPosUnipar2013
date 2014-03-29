package aula20130329.observer.p2;

public class CartaoDeCredito {
    private CartaoDeCreditoListener listener = new CartaoDeCreditoNullListener();
    
    public void debitar(double valor) {
        listener.debitoRealizado(valor);
    }

    public void setListener(CartaoDeCreditoListener listener) {
        this.listener = listener;
    }
    
    
}
