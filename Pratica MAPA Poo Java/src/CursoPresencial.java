public class CursoPresencial extends Curso{
    private String salaAula;

    //Construtor
    public CursoPresencial(String salaAula, String nome, String codigo, int cargaHoraria){
        super(nome, codigo, cargaHoraria);
        setSalaAula(salaAula);

    }

    //Setters & Getters
    public void setSalaAula(String salaAula) {
        if (Validador.validarString(salaAula)){
            this.salaAula = salaAula;
        }else {
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getSalaAula() {
        return salaAula;
    }

    @Override
    public String detalharCurso(){
        return "Nome: " + getNome() +
                "\nCodigo: " + getCodigo() +
                "\nCarga horaria: " + getCargaHoraria() +
                "\nSala de aula" + getSalaAula();
    }
}
