package aula20130308.templatemethod.p1;

public abstract class CalcularIRPF2014 {
    public static final int ANO_DECLARACAO = 2014;
    
    public final double calcularValorDevido() {
        double valorDevido = 0.0;
        if (!estahDentroDoPrazo(ANO_DECLARACAO)) {
            throw new PrazoParaDeclaracaoExpiradoException();
        }
        valorDevido = 
                recuperarBaseDeCalculo() * 
                (recuperarAliquota(recuperarBaseDeCalculo())/100);
        return valorDevido;
    }
    
    public abstract boolean estahDentroDoPrazo(int ano);

    public abstract double recuperarBaseDeCalculo();

    public abstract double recuperarAliquota(double baseDeCalculo);
    
}
