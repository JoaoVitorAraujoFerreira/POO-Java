public class Professor extends Usuario implements Autenticacao{
    private String especialidade;
    private String registro;

    // Construtor
    public Professor(String nome, String especialidade, String registro){
        super(nome);
        setEspecialidade(especialidade);
        setRegistro(registro);
    }

    // Getters & Setters

    public void setEspecialidade(String especialidade) {
        if (Validador.validarString(especialidade)){
            this.especialidade = especialidade;
        }else{
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setRegistro(String registro) {
        if (Validador.validarString(registro)){
            this.registro = registro;
        }else {
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getRegistro() {
        return registro;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        System.out.println("Login como professor");
        return true;
    }
}
