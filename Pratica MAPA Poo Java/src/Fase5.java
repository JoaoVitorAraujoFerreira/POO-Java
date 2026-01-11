public class Fase5 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro", "A01", "Engenharia de Hardware");
        Professor p1 = new Professor("João", "Engenharia de Software", "P01");
        Administrador adm1 = new Administrador("Victor");

        System.out.println("Nome do aluno: " + a1.getNome() + "\nNome do professor: " + p1.getNome() +
                "\nNome do Administrador: " + adm1.getNome());

        a1.autenticar("Login Aluno", "Senha");
        p1.autenticar("Login Professor", "Senha");
        adm1.autenticar("Login Administrador", "Senha");

    }
}
