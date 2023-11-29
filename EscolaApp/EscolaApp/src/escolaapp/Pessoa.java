package escolaapp;

import java.io.Serializable;

public class Pessoa implements Serializable {
    protected String nome;
    protected int id;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getId() {
        return id;
    }
}