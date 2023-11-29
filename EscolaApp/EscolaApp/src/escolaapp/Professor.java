package escolaapp;

public class Professor extends Pessoa {
    private int dataContratacao;
    private String disciplina;

    public Professor(String nome, int id, int dataContratacao, String disciplina) {
        super(nome, id);
        this.dataContratacao = dataContratacao;
        this.disciplina = disciplina;
    }
    
    public int getdataContratacao() {
        return dataContratacao;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    
}