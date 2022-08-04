package day40_final;

public class A {
    protected String isim= "Cuneyt";
    final static String OKUL= "Yildiz koleji";

    /*
        Bir variable final olarak taminlandiysa baska classlardan veya icinde oldugumuz
        class dan bu variable a baska deger atanmasi mumkun degildir.

        Mademki degeri degistirilemiyor, genelde static te yaparak bu variable a erisim kolaylastirilabilir.

        Genelde static variable olarak belirlenen variable isimleri BUYUK HARFLE yazilir.



         */

    final void finalMethod(){
        System.out.println("Final methodlar overridedilemez");
        /*
        Bir methodu final olarak isaretlersseniz bu method degistirilemez demektir(Override edilemez)
         */
    }
}
