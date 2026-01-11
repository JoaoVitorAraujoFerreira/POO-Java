public class Aluno extends Usuario implements Autenticacao{
    private String matricula;
    private String curso;


    // Construtor

    public Aluno(String nome, String matricula, String curso){
        super(nome);
        setMatricula(matricula);
        setCurso(curso);
    }

    // Getteres & Setters
    public void setMatricula(String matricula) {
        if (Validador.validarString(matricula)){
            this.matricula = matricula;
        }else {
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        if (Validador.validarString(curso)){
            this.curso = curso;
        }else{
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        System.out.println("Login como aluno");
        return true;
    }

}
