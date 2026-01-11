public class Fase2 {
    public static void main(String[] args){

        Professor p1 = new Professor("Paulo","Logica de Programação","P02");

        Curso c1 = new Curso("Python","C02",60);


        Turma t1 = new Turma("T01", p1, c1);

        Aluno a1 = new Aluno("João","A01","Logica de Programação");
        Aluno a2 = new Aluno("Victor","A02","Logica de Programação");
        Aluno a3 = new Aluno("Manuel","A03","Logica de Programação");
        Aluno a4 = new Aluno("Carlos","A04","Logica de Programação");

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);
        t1.adicionarAluno(a4);

        System.out.println(t1.resumoTurma());

        t1.removerAluno(a4);

        System.out.println(t1.resumoTurma());
    }
}
