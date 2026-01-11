public class Validador {
    public static boolean validarString(String texto){
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean validarNumeroInteiro(int numero) {
        return numero >= 0;
    }

}
