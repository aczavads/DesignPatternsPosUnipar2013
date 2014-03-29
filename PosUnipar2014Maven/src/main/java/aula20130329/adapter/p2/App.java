package aula20130329.adapter.p2;

public class App {

    public static void main(String[] args) {
        TomadaDeDoisPinos tomadaDe2 = new TomadaDeDoisPinos();
        tomadaDe2.conectar(new Plug2Bosch());

        //tomada.conectar(new PlugDeTresPinos()); 
        AdaptadorDeTresParaDoisPinos adaptador = new AdaptadorDeTresParaDoisPinos();
        adaptador.conectar(new Plug3Fame());
        tomadaDe2.conectar(adaptador);

        TomadaDeTresPinos tomadaDe3 = new TomadaDeTresPinos();
        tomadaDe3.conectar(new Plug3Fame());
        tomadaDe3.conectar(new PlugFameUniversal());
        tomadaDe2.conectar(new PlugFameUniversal());

    }

}
