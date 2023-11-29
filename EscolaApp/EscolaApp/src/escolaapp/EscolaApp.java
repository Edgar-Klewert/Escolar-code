package escolaapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class EscolaApp {
    private List<Escola> escolas = new ArrayList<>();
    private List<Diretor> diretores = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private static final String FILE_NAME = "escolas.ser";
    private static final String FILE_NAME2 = "diretores.ser";
    private static final String FILE_NAME3 = "professores.ser";
    private static final String FILE_NAME4 = "alunos.ser";
    private static final String FILE_NAME5 = "cursos.ser";

    // Declaração dos campos aqui
    private JTextField nomeeEscolaField;
    private JTextField enderecoEscolaField;
    private JTextField ideEscolaField;
    private JTextField anoFundacaoField;
    
    private JTextField nomeDiretorField;
    private JTextField idDiretorField;
    private JTextField dataContratacaoDiretorField;

    private JTextField nomeProfessorField;
    private JTextField idProfessorField;
    private JTextField dataContratacaoProfessorField;
    private JTextField disciplinaProfessorField;

    private JTextField nomeAlunoField;
    private JTextField matriculaAlunoField;
    private JTextField serieAlunoField;
    private JTextField dataInscricaoAlunoField;

    private JTextField nomeCursoField;
    private JTextField codigoCursoField;
    private JTextField descricaoCursoField;
    private JTextField anoInicioCursoField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EscolaApp app = new EscolaApp();
            app.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Sistema de Gerenciamento Escolar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JButton criarEscolaButton = new JButton("Criar Escola");
        JButton adicionarDiretorButton = new JButton("Adicionar Diretor");
        JButton adicionarProfessorButton = new JButton("Adicionar Professor");
        JButton adicionarAlunoButton = new JButton("Adicionar Aluno");
        JButton criarCursoButton = new JButton("Criar Curso");
        JButton gerarRelatorioButton = new JButton("Gerar Relatório das escolas");
        JButton gerarRelatorio2Button = new JButton("Gerar Relatório dos diretores");
        JButton gerarRelatorio3Button = new JButton("Gerar Relatório dos professores");
        JButton gerarRelatorio4Button = new JButton("Gerar Relatório dos alunos");
        JButton gerarRelatorio5Button = new JButton("Gerar Relatório dos cursos");

        // Inicialização dos campos aqui
        nomeeEscolaField = new JTextField(20);
        enderecoEscolaField = new JTextField(20);
        ideEscolaField = new JTextField(5);
        anoFundacaoField = new JTextField(4);

        nomeDiretorField = new JTextField(20);
        idDiretorField = new JTextField(5);
        dataContratacaoDiretorField = new JTextField(10);

        nomeProfessorField = new JTextField(20);
        idProfessorField = new JTextField(5);
        dataContratacaoProfessorField = new JTextField(10);
        disciplinaProfessorField = new JTextField(15);

        nomeAlunoField = new JTextField(20);
        matriculaAlunoField = new JTextField(8);
        serieAlunoField = new JTextField(5);
        dataInscricaoAlunoField = new JTextField(10);

        nomeCursoField = new JTextField(20);
        codigoCursoField = new JTextField(5);
        descricaoCursoField = new JTextField(30);
        anoInicioCursoField = new JTextField(4);

        panel.add(new JLabel("Nome da Escola:"));
        panel.add(nomeeEscolaField);
        panel.add(new JLabel("Endereço:"));
        panel.add(enderecoEscolaField);
        panel.add(new JLabel("ID da Escola:"));
        panel.add(ideEscolaField);
        panel.add(new JLabel("Ano de Fundação:\n"));
        panel.add(anoFundacaoField);
        panel.add(new JLabel("Nome do Diretor:"));
        panel.add(nomeDiretorField);
        panel.add(new JLabel("ID do Diretor:"));
        panel.add(idDiretorField);
        panel.add(new JLabel("Data de Contratação do Diretor:"));
        panel.add(dataContratacaoDiretorField);
        panel.add(new JLabel("Nome do Professor:"));
        panel.add(nomeProfessorField);
        panel.add(new JLabel("ID do Professor:"));
        panel.add(idProfessorField);
        panel.add(new JLabel("Data de Contratação do Professor:"));
        panel.add(dataContratacaoProfessorField);
        panel.add(new JLabel("Disciplina do Professor:"));
        panel.add(disciplinaProfessorField);
        panel.add(new JLabel("Nome do Aluno:"));
        panel.add(nomeAlunoField);
        panel.add(new JLabel("Matrícula do Aluno:"));
        panel.add(matriculaAlunoField);
        panel.add(new JLabel("Série do Aluno:"));
        panel.add(serieAlunoField);
        panel.add(new JLabel("Data de Inscrição do Aluno:"));
        panel.add(dataInscricaoAlunoField);
        panel.add(new JLabel("Nome do Curso:"));
        panel.add(nomeCursoField);
        panel.add(new JLabel("Código do Curso:"));
        panel.add(codigoCursoField);
        panel.add(new JLabel("Descrição do Curso:"));
        panel.add(descricaoCursoField);
        panel.add(new JLabel("Ano de Início do Curso:"));
        panel.add(anoInicioCursoField);

        panel.add(criarEscolaButton);
        panel.add(adicionarDiretorButton);
        panel.add(adicionarProfessorButton);
        panel.add(adicionarAlunoButton);
        panel.add(criarCursoButton);
        panel.add(gerarRelatorioButton);
        panel.add(gerarRelatorio2Button);
        panel.add(gerarRelatorio3Button);
        panel.add(gerarRelatorio4Button);
        panel.add(gerarRelatorio5Button);

        criarEscolaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarEscola(nomeeEscolaField.getText(), enderecoEscolaField.getText(),
                        Integer.parseInt(ideEscolaField.getText()), Integer.parseInt(anoFundacaoField.getText()));
                JOptionPane.showMessageDialog(frame, "Escola criada com sucesso!");
                nomeeEscolaField.setText("");
                enderecoEscolaField.setText("");
                ideEscolaField.setText("");
                anoFundacaoField.setText("");
            }
        });

        adicionarDiretorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarDiretor( nomeDiretorField.getText(),
                        Integer.parseInt(idDiretorField.getText()), Integer.parseInt (dataContratacaoDiretorField.getText()));
                JOptionPane.showMessageDialog(frame, "Diretor adicionado com sucesso!");
                nomeDiretorField.setText("");
                idDiretorField.setText("");
                dataContratacaoDiretorField.setText("");
            }
        });

        adicionarProfessorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProfessor(Integer.parseInt(ideEscolaField.getText()), nomeProfessorField.getText(),
                        Integer.parseInt(idProfessorField.getText()), Integer.parseInt(dataContratacaoProfessorField.getText()),
                        disciplinaProfessorField.getText());
                JOptionPane.showMessageDialog(frame, "Professor adicionado com sucesso!");
                nomeProfessorField.setText("");
                idProfessorField.setText("");
                dataContratacaoProfessorField.setText("");
                disciplinaProfessorField.setText("");
            }
        });

        adicionarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarAluno(Integer.parseInt(ideEscolaField.getText()),nomeAlunoField.getText(),
                        Integer.parseInt(matriculaAlunoField.getText()), Integer.parseInt(serieAlunoField.getText()),
                        Integer.parseInt(dataInscricaoAlunoField.getText()));
                JOptionPane.showMessageDialog(frame, "Aluno adicionado com sucesso!");
                nomeAlunoField.setText("");
                matriculaAlunoField.setText("");
                serieAlunoField.setText("");
                dataInscricaoAlunoField.setText("");
            }
        });

        criarCursoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarCurso(Integer.parseInt(ideEscolaField.getText()), nomeCursoField.getText(),
                        Integer.parseInt(codigoCursoField.getText()), descricaoCursoField.getText(),
                        Integer.parseInt(anoInicioCursoField.getText()));
                JOptionPane.showMessageDialog(frame, "Curso criado com sucesso!");
                nomeCursoField.setText("");
                codigoCursoField.setText("");
                descricaoCursoField.setText("");
                anoInicioCursoField.setText("");
            }
        });

        gerarRelatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relatorio.gerarRelatorio(escolas);
            }
        });

        frame.pack();
        frame.setVisible(true);

        // Carregar dados ao iniciar o aplicativo
        carregarEscolas();
        
        gerarRelatorio2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relatorio.gerarRelatorio2(diretores);
            }
        });

        frame.pack();
        frame.setVisible(true);

        // Carregar dados ao iniciar o aplicativo
        carregarDiretores();
        
        gerarRelatorio3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relatorio.gerarRelatorio3(professores);
            }
        });

        frame.pack();
        frame.setVisible(true);

        // Carregar dados ao iniciar o aplicativo
        carregarProfessores();
        
        gerarRelatorio4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relatorio.gerarRelatorio4(alunos);
            }
        });

        frame.pack();
        frame.setVisible(true);

        // Carregar dados ao iniciar o aplicativo
        carregarAlunos();
        
        gerarRelatorio5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relatorio.gerarRelatorio5(cursos);
            }
        });

        frame.pack();
        frame.setVisible(true);

        // Carregar dados ao iniciar o aplicativo
        carregarCursos();
        
    }

    // Métodos para criar e gerenciar escolas, diretores, professores, alunos, cursos e relatórios aqui

    private void criarEscola(String nome, String endereco, int id, int anoFundacao) {
        Escola escola = new Escola(nome, endereco, id, anoFundacao);
        escolas.add(escola);
        salvarDados();
    }

    private void adicionarDiretor(String nome, int id, int dataContratacao) {
            Diretor diretor = new Diretor(nome, id, dataContratacao);
            diretores.add(diretor);
             salvarDados2();
        
    }

    private void adicionarProfessor(int ideEscola, String nome, int id, int dataContratacao, String disciplina) {
        Escola escola = buscarEscola(ideEscola);
        if (escola != null) {
            Professor professor = new Professor(nome, id, dataContratacao, disciplina);
            professores.add(professor);
           salvarDados3();
        }
    }

    private void adicionarAluno(int ideEscola,String nome, int matricula, int serie, int dataInscricao) {
            Escola escola = buscarEscola(ideEscola);
        if (escola != null) {
            Aluno aluno = new Aluno(nome, matricula, serie, dataInscricao);
            alunos.add(aluno);
            salvarDados4();
        }
    }

    private void criarCurso(int ideEscola, String nome, int codigo, String descricao, int anoInicio) {
        Escola escola = buscarEscola(ideEscola);
        if (escola != null) {
            Curso curso = new Curso(nome, codigo, descricao, anoInicio);
            cursos.add(curso);
            salvarDados5();
        }
    }

    private Escola buscarEscola(int id) {
        for (Escola escola : escolas) {
            if (escola.getIde() == id) {
                return escola;
            }
        }
        return null;
    }

    private void salvarDados() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(escolas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void salvarDados2() {
        try (ObjectOutputStream outputStream2 = new ObjectOutputStream(new FileOutputStream(FILE_NAME2))) {
            outputStream2.writeObject(diretores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void salvarDados3() {
        try (ObjectOutputStream outputStream3 = new ObjectOutputStream(new FileOutputStream(FILE_NAME3))) {
            outputStream3.writeObject(professores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvarDados4() {
        try (ObjectOutputStream outputStream4 = new ObjectOutputStream(new FileOutputStream(FILE_NAME4))) {
            outputStream4.writeObject(alunos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     private void salvarDados5() {
        try (ObjectOutputStream outputStream5 = new ObjectOutputStream(new FileOutputStream(FILE_NAME5))) {
            outputStream5.writeObject(cursos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    private void carregarEscolas() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Object obj = inputStream.readObject();
            if (obj instanceof List) {
                escolas = (List<Escola>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Se não conseguir ler, apenas ignore e use a lista vazia
        }
    }
    
    @SuppressWarnings("unchecked")
    private void carregarDiretores() {
        try (ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(FILE_NAME2))) {
            Object obj2 = inputStream2.readObject();
            if (obj2 instanceof List) {
                diretores = (List<Diretor>) obj2;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Se não conseguir ler, apenas ignore e use a lista vazia
        }
    }
    
    @SuppressWarnings("unchecked")
    private void carregarProfessores() {
        try (ObjectInputStream inputStream3 = new ObjectInputStream(new FileInputStream(FILE_NAME3))) {
            Object obj3 = inputStream3.readObject();
            if (obj3 instanceof List) {
                professores = (List<Professor>) obj3;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Se não conseguir ler, apenas ignore e use a lista vazia
        }
    }

    @SuppressWarnings("unchecked")
    private void carregarAlunos() {
        try (ObjectInputStream inputStream4 = new ObjectInputStream(new FileInputStream(FILE_NAME4))) {
            Object obj4 = inputStream4.readObject();
            if (obj4 instanceof List) {
                alunos = (List<Aluno>) obj4;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Se não conseguir ler, apenas ignore e use a lista vazia
        }
    }
    
        @SuppressWarnings("unchecked")
    private void carregarCursos() {
        try (ObjectInputStream inputStream5 = new ObjectInputStream(new FileInputStream(FILE_NAME5))) {
            Object obj5 = inputStream5.readObject();
            if (obj5 instanceof List) {
                cursos = (List<Curso>) obj5;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Se não conseguir ler, apenas ignore e use a lista vazia
        }
    }
    
}