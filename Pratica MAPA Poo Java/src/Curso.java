public class Curso {
    private String nome;
    private String codigo;
    private int cargaHoraria;

    // Construtor
    public Curso(String nome, String codigo, int cargaHoraria){
        setNome(nome);
        setCodigo(codigo);
        setCargaHoraria(cargaHoraria);
    }

    // Getters & Setters

    public void setNome(String nome) {
        if (Validador.validarString(nome)){
            this.nome = nome;
        }else{
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        if (Validador.validarString(codigo)){
            this.codigo = codigo;
        }else {
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (Validador.validarNumeroInteiro(cargaHoraria)){
            this.cargaHoraria = cargaHoraria;
        }else {
            System.out.println("Entrada de dados invalida.");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String detalharCurso(){
        return "Nome: " + getNome() + "\nCodigo: " + getCodigo() + "\nCarga horaria: " + getCargaHoraria();
    }
}
