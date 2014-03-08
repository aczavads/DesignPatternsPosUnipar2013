package aula20130308.builder.p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {
    private Connection conn;
    
    public boolean isClosed() {
        try {
            return this.conn.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public static class BuilderPostgreSQL extends Builder {        
        public BuilderPostgreSQL() {
            this.port(5432);
            this.user("postgres");
            this.password("postgres");
            this.driver("jdbc:postgresql");
            this.server("localhost");
            this.database("postgres");
        }        
    }
    
    public static class Builder {
        private String user;
        private String server;
        private String database;
        private int port;
        private String password;
        private String driver;
        
        public Builder password(String p) {
            this.password = p;
            return this;
        }
        public Builder driver(String d) {
            this.driver = d;
            return this;
        }
        public Builder port(int p) {
            this.port = p;
            return this;
        }
        public Builder database(String db) {
            this.database = db;
            return this;
        }
        public Builder user(String u) {
            this.user = u;
            return this;
        }
        public Builder server(String s) {
            this.server = s;
            return this;
        }
        public ConexaoBD build() {
            ConexaoBD novaConexaoBD = new ConexaoBD();
            try {
                novaConexaoBD.conn = DriverManager.getConnection(
                        //jdbc:postgres://localhost:5432/posunipar
                        this.driver + "://" + this.server +":"+this.port+"/"+this.database, 
                        this.user,
                        this.password);
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            return novaConexaoBD;
        }
    }    
}
