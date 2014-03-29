package aula20130329.decorator.p2;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.zip.GZIPOutputStream;

public class App {

    public static void main(String[] args) {
        try {
            InputStream is = App.class.getResourceAsStream("origem.txt");
            //OutputStream out = new GZIPOutputStream(new FileOutputStream("c:\\temp\\destino.txt"));
            OutputStream out = new GZIPOutputStream(System.out);
            
            int dado = -1;
            while ((dado = is.read()) != -1) {
                out.write((char)dado);
            }            
            out.flush();
            out.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
