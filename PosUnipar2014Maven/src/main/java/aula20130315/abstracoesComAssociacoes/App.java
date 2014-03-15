package aula20130315.abstracoesComAssociacoes;


public class App {
    
    public static void main(String[] args) {
        TampaDePincel tampa = new TampaDePincel();
        
        tampa.setPincel(new PincelModeloAzul());
        System.out.println(tampa);
        
        tampa.setPincel(new PincelModeloVermelho());
        System.out.println(tampa);
        
        tampa.setPincel(new PincelModeloPreto());
        System.out.println(tampa);        
    }    
}








