package day41_abstractClass_Interface;

public class C01_Exception {
    public static void main(String[] args) {

        try {
            çalış();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void çalış() {

        throw new RuntimeException("Çoook çalış");

        /*
        throw ile kontrollu exception olustururken parametre olarak istedigimiz hata mesajini girebiliriz.
         */
    }
}
