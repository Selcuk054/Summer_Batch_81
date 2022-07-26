package day31_timeFormatter_varargs;

public class C04VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYAzdir("Ali","Ayse","Ismail","Kemalettin");

    }

    public static void enUzunKelimeyiYAzdir(String... kelime) {

        String enUzunKelime=kelime[0];
        for (String each:kelime
             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }


        }
        System.out.println("Girilen kelimelerden en uzunu : "+enUzunKelime);



    }
}
