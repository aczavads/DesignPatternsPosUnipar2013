package aula20130329.decorator.p1;

public class App {
    
    public static void main(String[] args) {
        IPessoa tony = new ArmaduraDoTonyStark(new Pessoa());
        //IPessoa tony = new Pessoa();
        
        tony.pular();
        
        lancarArmadura((ArmaduraDoTonyStark)tony);
        /*
        if (tony instanceof ArmaduraDoTonyStark) {
            ArmaduraDoTonyStark aux = (ArmaduraDoTonyStark) tony;
            aux.voar();
        }
        */        
    }
    private static void lancarArmadura(ArmaduraDoTonyStark cara) {
        cara.voar();
    }
    
}
