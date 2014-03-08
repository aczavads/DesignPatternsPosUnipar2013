package aula20130308.singleton.p1;

public class App {

    public static void main(String[] args) {
        testarInstanciasComConstrutor();
        testarInstanciasComSingleton();

    }

    private static void testarInstanciasComSingleton() {
        System.out.println(" === com singleton ===");
        GeradorDeNumeros g = GeradorDeNumeros.criarGeradorDeNumeros();
        System.out.println(g);
        for (int i = 0; i < 3; i++) {
            GeradorDeNumeros aux = GeradorDeNumeros.criarGeradorDeNumeros();
            System.out.println(aux);
        }
    }

    private static void testarInstanciasComConstrutor() {
        System.out.println(" === com construtor ===");
        GeradorDeNumeros g = new GeradorDeNumeros();
        System.out.println(g);
        for (int i = 0; i < 3; i++) {
            GeradorDeNumeros aux = new GeradorDeNumeros();
            System.out.println(aux);
        }
    }
}
