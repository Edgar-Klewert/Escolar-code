package escolaapp;

public class Aluno extends Pessoa {
    private int matricula;
    private int serie;
    private int dataInscricao;

    public Aluno(String nome, int matricula, int serie, int dataInscricao) {
        super(nome, 0); // Atributo id não utilizado para alunos
        this.matricula = matricula;
        this.serie = serie;
        this.dataInscricao = dataInscricao;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public int getSerie() {
        return serie;
    }
    
    public int getdataInscricao() {
        return dataInscricao;
    }
}