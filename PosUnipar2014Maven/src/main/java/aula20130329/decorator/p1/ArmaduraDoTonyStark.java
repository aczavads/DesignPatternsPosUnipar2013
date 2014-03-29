package aula20130329.decorator.p1;

public class ArmaduraDoTonyStark implements IPessoa {
    private final Pessoa pessoa;

    public ArmaduraDoTonyStark(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void andar() {
        this.pessoa.andar();
        System.out.println("Super andar!");
    }

    public void correr() {
        this.pessoa.correr();
        System.out.println("Super correr!");
    }

    public void pular() {
        this.pessoa.pular();
        System.out.println("Super pular!");
    }
    
    public void voar() {
        System.out.println("Voando!!");
    }
    
}
