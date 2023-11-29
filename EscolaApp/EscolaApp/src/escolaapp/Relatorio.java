package escolaapp;

import java.io.Serializable;
import java.util.List;

public class Relatorio implements Serializable {
    public static void gerarRelatorio(List<Escola> escolas) {
        System.out.println("Relatório:");
      
        for (Escola escola : escolas) {
            System.out.println("Escola: " + escola.getNomee());
            System.out.println("Endereco: " + escola.getEndereco());
            System.out.println("Id: " + escola.getIde());
            System.out.println("Ano de fundacao: " + escola.getanoFundacao());
            System.out.println("-----------------------");
        }
    }
      public static void gerarRelatorio2(List<Diretor> diretores) {
        System.out.println("Relatório:");
        
        for (Diretor diretor : diretores) {
            System.out.println("Diretor: " + diretor.getNome());
            System.out.println("Id do diretor: " + diretor.getId());
            System.out.println("Data de contratacao: " + diretor.getdataContratacao());
            System.out.println("-----------------------");
        }
         
    }
      public static void gerarRelatorio3(List<Professor> professores) {
        System.out.println("Relatório:");
        
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
            System.out.println("Id do professor: " + professor.getId());
            System.out.println("Data de contratacao: " + professor.getdataContratacao());
            System.out.println("Disciplina: " + professor.getDisciplina());
            System.out.println("-----------------------");
        }
      }
      
      static void gerarRelatorio4(List<Aluno> alunos) {
        System.out.println("Relatório:");
        
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Serie: " + aluno.getSerie());
            System.out.println("Data de inscricao: " + aluno.getdataInscricao());
            System.out.println("-----------------------");
        }
      }

     public static void gerarRelatorio5(List<Curso> cursos) {
        System.out.println("Relatório:");
        
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNome());
            System.out.println("Codigo: " + curso.getCodigo());
            System.out.println("Descricao: " + curso.getDescricao());
            System.out.println("Ano de inicio: " + curso.getAnoInicio());
            System.out.println("-----------------------");
        }
      }
      
}