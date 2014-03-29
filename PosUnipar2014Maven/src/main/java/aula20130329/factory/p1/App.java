package aula20130329.factory.p1;

public class App {
    
    public static void main(String[] args) {
        FolhaDePagamento fp = new FolhaDePagamento();
        fp.setMesBase(12);
        fp.setAnoBase(2014);
        fp.setBaseDeCalculo(3456987.33);
        fp.calcularFolha();        
    }
    
}
