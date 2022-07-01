package day10_stringManpulation;


import java.util.Locale;

public class C02_tolowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase()); // BENİ PSİKOPATA BAGLAMAYİN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Nl")));

        /* eger buyuk kucuk harf donusumunde local birdili esas almak isterseniz bu method kullanilabilir

         */

    }

}
