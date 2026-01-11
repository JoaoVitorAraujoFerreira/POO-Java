public class Avaliacao {
    private int nota;
    private String descricao;
    private Turma turma;
    private Aluno aluno;

    public Avaliacao(int nota, String descricao, Turma turma, Aluno aluno){
        if (aluno==null){
            System.out.println("Entada de dados invalida");
        }else {
            boolean controle = false;
            for (int i = 0; i < turma.getListaAlunos().size(); i++) {

                if (aluno.getMatricula().equals(turma.getListaAlunos().get(i).getMatricula())) {
                    setAluno(aluno);
                    controle = true;
                    break;
                }

            }
            if (!controle) {
                System.out.println("O aluno não pertence a esta turma");
            } else {
                setDescricao(descricao);
                atribuirNota(nota);
                setTurma(turma);

            }
        }
    }


    // Getters & Setters
    public void setDescricao(String descricao) {
        if(Validador.validarString(descricao)) {
            this.descricao = descricao;
        }else {
            System.out.println("Entrada de dados invalida.");

        }
    }

    public String getDescricao(){
        return descricao;
    }


    public void setAluno(Aluno aluno){
            this.aluno = aluno;
    }

    public Aluno getAluno(){
        return this.aluno;
    }


    public void setTurma(Turma turma){
        if (turma==null){
            System.out.println("Entada de dados invalida");
        }else {
            this.turma = turma;
        }
    }

    public Turma getTurma(){
        return this.turma;
    }


    private void atribuirNota(int nota){
        if (Validador.validarNumeroInteiro(nota)){
            this.nota=nota;
        } else {
            System.out.println("Nota invalida.");
        }
    }

    public int getNota(){
        return nota;
    }

}
