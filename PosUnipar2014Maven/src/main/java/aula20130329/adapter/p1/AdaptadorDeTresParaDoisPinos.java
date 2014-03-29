package aula20130329.adapter.p1;

public class AdaptadorDeTresParaDoisPinos extends PlugDeDoisPinos{
    private PlugDeTresPinos plug;

    public void conectar(PlugDeTresPinos plug) {
        this.plug = plug;
    }
    
}
