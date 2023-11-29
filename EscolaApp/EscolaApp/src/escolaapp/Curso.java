package escolaapp;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {
    private String nome;
    private int codigo;
    private String descricao;
    private int anoInicio;
    private List<Aluno> alunosInscritos = new ArrayList<>();

    public Curso(String nome, int codigo, String descricao, int anoInicio) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.anoInicio = anoInicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void adicionarAluno(Aluno aluno) {
        alunosInscritos.add(aluno);
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getAnoInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<Aluno> getAlunosInscritos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}