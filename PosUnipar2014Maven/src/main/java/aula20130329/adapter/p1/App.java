package aula20130329.adapter.p1;

public class App {
    
    public static void main(String[] args) {
        TomadaDeDoisPinos tomada = new TomadaDeDoisPinos();
        tomada.conectar(new PlugDeDoisPinos());
        
        //tomada.conectar(new PlugDeTresPinos()); 
        AdaptadorDeTresParaDoisPinos adaptador = new AdaptadorDeTresParaDoisPinos();
        adaptador.conectar(new PlugDeTresPinos());
        tomada.conectar(adaptador); 
    }
    
}
