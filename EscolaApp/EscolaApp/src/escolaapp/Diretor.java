package escolaapp;

public class Diretor extends Pessoa {
    private int dataContratacao;

    public Diretor(String nome, int id, int dataContratacao) {
        super(nome, id);
        this.dataContratacao = dataContratacao;
    }
    
    public int getdataContratacao() {
        return dataContratacao;
    }
}