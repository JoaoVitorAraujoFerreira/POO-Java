public class Fase4 {
    public static void main(String[] args){
        CursoPresencial cp1 = new CursoPresencial("Sala 01", "Engenharia de Software", "CP01",120);
        CursoEad ce1 = new CursoEad("Sala virtual", "Engenharia de requisitos","CE01",100);

        System.out.println("Curso presencial:\n" + cp1.detalharCurso());
        System.out.println("Curso EAD:\n" + ce1.detalharCurso());

    }
}
