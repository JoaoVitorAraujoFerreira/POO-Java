public class Administrador extends Usuario implements Autenticacao{

    public Administrador(String nome) {
        super(nome);
    }

    @Override
    public boolean autenticar(String login, String senha) {
        System.out.println("Login como administrador");
        return true;
    }
}
