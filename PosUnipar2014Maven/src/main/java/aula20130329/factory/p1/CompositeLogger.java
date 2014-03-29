package aula20130329.factory.p1;

import java.util.ArrayList;
import java.util.List;

public class CompositeLogger implements Logger {
    private List<Logger> loggers = new ArrayList<Logger>();

    public void addLogger(Logger l) {
        this.loggers.add(l);
    }
    public void log(String s) {
        for (Logger logger : loggers) {
            logger.log(s);
        }
    }
    
}
