package aula20130315.abstracoesComAssociacoes;

public class TampaDePincel {
    private Pincel pincel;
    
    public void setPincel(Pincel p) {
        this.pincel = p;
    }

    @Override
    public String toString() {
        return "Tampa vinculada a pincel: " + pincel;
    }
    
    
    
    
}
