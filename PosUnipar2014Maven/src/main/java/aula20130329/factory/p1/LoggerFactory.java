package aula20130329.factory.p1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public abstract class LoggerFactory {

    public static Logger createInstance() {
//        if (System.nanoTime()%2 == 0) {
//            return new NullLogger();
//        } else {
//            return new ConsoleLogger();
//        }
        try {
            //InputStream is = new FileInputStream("C:\\Users\\Arthur\\Documents\\NetBeansProjects\\DesignPatternsPosUnipar2013\\PosUnipar2014Maven\\src\\main\\java\\LoggerFactory.properties");
            InputStream is = LoggerFactory.class.getResourceAsStream("LoggerFactory.properties");
            Properties props = new Properties();
            props.load(is);
            is.close();            
            String tipoDoLogger = props.getProperty("tipoDoLogger");
            /*
            if (tipoDoLogger.equalsIgnoreCase("NULL")) {
                return new NullLogger();
            } else if (tipoDoLogger.equalsIgnoreCase("CONSOLE")) {
                return new ConsoleLogger();
            } else if (tipoDoLogger.equalsIgnoreCase("WINDOW")) {
                return new WiindowLogger();
            }
            */
            Class classeDoLogger = Class.forName(tipoDoLogger);
            return (Logger)classeDoLogger.newInstance();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
