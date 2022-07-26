package day31_timeFormatter_varargs;

public class C05_VarargParametreIleKullanma {
    public static void main(String[] args) {
        enUzunKelimeyiYAzdir(5,"Ali","Ayse","Ismail","Kemalettin","Akin");

    }

    public static void enUzunKelimeyiYAzdir(int kelimeSayisi, String... kelime) {

        /*
        Varargs teorik olarak sonsuz sayida element alabilir bir methodda parametre olark varargs varsa
        varargs in sinirlarini bilebilmesi icin parametrelerin parametrelerin sonuncusu olmalidir.

        Oncesinde farkli parametreler olabilir ama varargs dan sonra parametre olamaz.

        B kuraldan oturu bir methodda sadee bir method olmalidir.
         */

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
