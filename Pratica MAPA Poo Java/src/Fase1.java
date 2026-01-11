public class Fase1 {
    public static void main(String[] args){
        Aluno a1 = new Aluno("João","A01","Poo Java");
        Professor p1 = new Professor("Vitor","Programação","P01");
        Curso c1 = new Curso("Poo Java","C01",80);

        System.out.println("Aluno: " + a1.getNome() + ". Curso: " + a1.getCurso() + ". Matricula " + a1.getMatricula());
        System.out.println("Professor: " + p1.getNome() + ". Especialidade: " + p1.getEspecialidade() + ". Registro: " + p1.getRegistro());
        System.out.println("Curso: " + c1.getNome() + ". Codigo: " + c1.getCodigo() + ". Carga Horaria: " + c1.getCargaHoraria());
    }
}
