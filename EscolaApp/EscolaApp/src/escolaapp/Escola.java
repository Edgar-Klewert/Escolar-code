package escolaapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Escola implements Serializable {
    private String nomee;
    private String endereco;
    private int ide;
    private int anoFundacao;
    private List<Diretor> diretores = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Escola(String nomee, String endereco, int ide, int anoFundacao) {
        this.nomee = nomee;
        this.endereco = endereco;
        this.ide = ide;
        this.anoFundacao = anoFundacao;
    }

    public int getIde() {
        return ide;
    }
    
    public String getNomee() {
        return nomee;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public int getanoFundacao() {
        return anoFundacao;
    }

    public void adicionarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void criarCurso(Curso curso) {
        cursos.add(curso);
    }

    public Aluno buscarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public Curso buscarCurso(int codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo() == codigo) {
                return curso;
            }
        }
        return null;
    }

    public void inscreverAlunoEmCurso(Aluno aluno, Curso curso) {
        curso.adicionarAluno(aluno);
    }
}