package aula20130308.singleton.p1;

public class GeradorDeNumeros {
    private static GeradorDeNumeros instancia;
    
    public GeradorDeNumeros() {
        System.out.println("construtor GeradorDeNumeros() foi chamado!");
    }
    
    public static GeradorDeNumeros criarGeradorDeNumeros() {
        if (instancia == null) {
            instancia = new GeradorDeNumeros();
        }
        return instancia;
    }
    
    
}
