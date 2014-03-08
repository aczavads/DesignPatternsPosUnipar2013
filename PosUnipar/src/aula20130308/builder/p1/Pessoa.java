package aula20130308.builder.p1;

import java.util.Date;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private Pessoa mae;
    private Pessoa pai;
    private Date dataNascimento;
    
    public Pessoa() {
        
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;        
        this.pai = pai;
    }
//    public Pessoa(String nome, Pessoa pai) {
//        this.nome = nome;
//        this.pai = pai;        
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public static class BuilderComNome extends Pessoa.Builder {
        private Builder b = new Builder();
        
        public BuilderComNome(String nome) {
            b.nome(nome);
        }

        @Override
        public Pessoa build() {
            return this.build();
        }
        
    }
    
    public static class Builder {
        private String nome;
        private Pessoa mae;
        private Pessoa pai;
        
        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }        
        public Builder mae(Pessoa mae) {
            this.mae = mae;
            return this;
        }        
        public Builder pai(Pessoa pai) {
            this.pai = pai;
            return this;
        }        
        public Pessoa build() {
            Pessoa p = new Pessoa();
            p.nome = this.nome;
            p.mae = this.mae;
            p.pai = this.pai;
            return p;
        }
    }
}
