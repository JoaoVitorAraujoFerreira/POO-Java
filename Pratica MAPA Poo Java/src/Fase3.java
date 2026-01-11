public class Fase3 {
    public static void main(String[] args){

        Professor p1 = new Professor("Paulo","Logica de Programação","P02");

        Curso c1 = new Curso("Python","C02",60);

        Turma t1 = new Turma("T01", p1, c1);

        Aluno a1 = new Aluno("João","A01","Logica de Programação");

        t1.adicionarAluno(a1);

        Avaliacao av1 = new Avaliacao(7, "Prova de Algebra booleana.",t1, a1);

        System.out.println(
                "Nota: " + av1.getNota() + "\nAluno: " + av1.getAluno().getNome() +"\n" + av1.getTurma().resumoTurma()
                        + "\nDescrição: " + av1.getDescricao()
        );

    }
}
