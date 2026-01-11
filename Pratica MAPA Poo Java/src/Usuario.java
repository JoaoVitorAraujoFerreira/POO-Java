public abstract class Usuario {
    private String nome;

    public Usuario(String nome){
        setNome(nome);
    }

    //Getters & Setters
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
}
