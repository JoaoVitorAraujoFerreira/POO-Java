public class CursoEad extends Curso{
    private String plataformaVirtual;

    //Construtor
    public CursoEad(String plataformaVirtual, String nome, String codigo, int cargaHoraria){
        super(nome, codigo, cargaHoraria);
        setPlataformaVirtual(plataformaVirtual);

    }

    //Setters & Getters
    public void setPlataformaVirtual(String plataformaVirtual) {
        if (Validador.validarString(plataformaVirtual)){
            this.plataformaVirtual = plataformaVirtual;
        }else {
            System.out.println("Entrada de dados invalida.");
        }
    }

    public String getPlataformaVirtual() {
        return plataformaVirtual;
    }

    @Override
    public String detalharCurso(){
        return "Nome: " + getNome() +
                "\nCodigo: " + getCodigo() +
                "\nCarga horaria: " + getCargaHoraria() +
                "\nPlataforma virtual" + getPlataformaVirtual();
    }
}
