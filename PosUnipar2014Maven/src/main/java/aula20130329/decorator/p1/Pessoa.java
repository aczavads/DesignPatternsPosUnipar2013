package aula20130329.decorator.p1;

public class Pessoa implements IPessoa {

    public void andar() {
        System.out.println("Andando normal...");
    }

    public void correr() {
        System.out.println("Correndo normal...");
    }

    public void pular() {
        System.out.println("Pulando normal...");
    }
    
}
