package aula20130329.factory.p1;

/**
 *
 * @author Arthur
 */
public class ConsoleLogger implements Logger {

    public ConsoleLogger() {
    }

    public void log(String s) {
        System.out.println(s);
    }
    
}
