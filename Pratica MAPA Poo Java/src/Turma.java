import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private Professor professor;
    private Curso curso;
    private List<Aluno> listaAlunos;

    // Construtor
    public Turma(String codigo, Professor professor, Curso curso) {
        this.listaAlunos = new ArrayList<Aluno>();
        setCodigo(codigo);
        setProfessor(professor);
        setCurso(curso);

    }

    // Adicionar e remover alunos
    public void adicionarAluno(Aluno aluno) {
        Boolean adicionar = true;
        if (aluno == null) {
            System.out.println("Aluno invalido");
        } else {

            for (Aluno a : listaAlunos) {
                if (a.getMatricula().equals(aluno.getMatricula())) {
                    adicionar = false;
                    break;
                }
            }

            if (adicionar == true) {
                listaAlunos.add(aluno);
            }

        }
    }

    public void removerAluno(Aluno aluno) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getMatricula().equals(aluno.getMatricula())) {
                listaAlunos.remove(i);
            }

            if (i == listaAlunos.size()){
                System.out.println("Aluno não encontrado.");
            }
        }
    }

    // Getters & Setters
    public void setProfessor(Professor professor){
        if (professor == null){
            System.out.println("Entrada de dados invalida.");
        }else {
            this.professor = professor;
        }
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setCurso(Curso curso){
        if (curso == null){
            System.out.println("Entrada de dados invalida.");
        }else {
            this.curso = curso;
        }
    }

    public Curso getCurso(){
        return curso;
    }

    public void setCodigo(String codigo){
        if (Validador.validarString(codigo)){
            this.codigo = codigo;
        }else{
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getCodigo(){
        return codigo;
    }

    public String resumoTurma(){
        return ("Turma: " + getCodigo() + "\nProfessor: " + professor.getNome() + "\nCurso: " +
                curso.getNome() + "\nNumero de alunos: " + listaAlunos.size());
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
