package aula20130329.factory.p1;

public class FolhaDePagamento {
    private int mesBase;
    private int anoBase;
    private double baseDeCalculo;
    //private Logger logger = new NullLogger();
    //private Logger logger = new ConsoleLogger();
    private Logger logger = LoggerFactory.createInstance();
    
    public void setMesBase(int mesBase) {
        logger.log("[FolhaDePagamento.setMesBase] ==> this.mesBase=" +this.mesBase );
        this.mesBase = mesBase;
        logger.log("[FolhaDePagamento.setMesBase] ==> this.mesBase=" +this.mesBase );
    }
    public void setAnoBase(int anoBase) {
        logger.log("[FolhaDePagamento.setAnoBase] ==> this.anoBase=" +this.anoBase );
        this.anoBase = anoBase;
        logger.log("[FolhaDePagamento.setAnoBase] ==> this.anoBase=" +this.anoBase );
    }
    public void setBaseDeCalculo(double baseDeCalculo) {
        logger.log("[FolhaDePagamento.setBaseDeCalculo] ==> this.baseDeCalculo=" +this.baseDeCalculo );
        this.baseDeCalculo = baseDeCalculo;
        logger.log("[FolhaDePagamento.setBaseDeCalculo] ==> this.baseDeCalculo=" +this.baseDeCalculo );
    }
    public double calcularFolha() {
        logger.log("[FolhaDePagamento.calcularFolha]");
        double total = 0.00;
        logger.log("[FolhaDePagamento.calcularFolha] ==> total=" + total);
        return total;
    }
    
}
