package aula20130329.observer.p2;

public class App {
    
    public static void main(String[] args) {
        CartaoDeCredito cc = new CartaoDeCredito();
        
        CartaoDeCreditoListener ccl = new CartaoDeCreditoListener() {
            public void debitoRealizado(double valor) {
                System.out.println("Foi realizado um débito de " + valor);
            }
        };
        
        cc.setListener(ccl);
        cc.debitar(100.99);
        cc.debitar(445.98);
        cc.debitar(6263.99);
    }
    
}
