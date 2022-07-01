package day10_stringManpulation;

public class C05_Length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap insallah";

        System.out.println(str.length());//sr in karakter sayisini dondurur. 19

        System.out.println(str.charAt(str.length()-1)); //son karakterini yazdiralim p

        System.out.println(str.charAt(str.length()-3));// sondan ucuncu karakteri yazdiralim



        /* java da "" null pointer "" (isaretleyici) bir deger degil,
        karsisina yaziladigi variable nin hicbir deger almadiginin isaretcisidir.
         */

        String str2=""; //str2 ye bir deger atanmismidir EVET
                          // bu deger nedir :hiclik degeri

        System.out.println(str2.length());// 0

        String str3= null; //str 3 e bir deger atanmismidir cevabi HAYIR
                           // null bu deger atamamayi isaret etmektedir.
        // null bir esitligin karsisinda olsa bile deger atama yoktur.

        System.out.println(str3.length());// bir deger atanmamiski nasil uzunlugu olsun.

    }
}
