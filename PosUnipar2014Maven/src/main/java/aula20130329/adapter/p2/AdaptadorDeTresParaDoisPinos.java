package aula20130329.adapter.p2;


public class AdaptadorDeTresParaDoisPinos implements PlugDeDoisPinos{
    private PlugDeTresPinos plug;

    public void conectar(PlugDeTresPinos plug) {
        this.plug = plug;
    }
    
}
