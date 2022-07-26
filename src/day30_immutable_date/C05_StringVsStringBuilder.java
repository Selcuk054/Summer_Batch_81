package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi Stringbuildermi daha hizlidir?
        Bunun icin bir string olusturup ,1000 kere sonuna . ekleyelim.oncesinde sonrasinda zamani alip aradaki farki bulalim

        ayni islemi string icin yapalim.


         */
        LocalTime baslangic=LocalTime.now();

        String str ="Ahh Java";
        for (int i = 0; i < 1000; i++) {
            str+=".";

        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Zaman :"+(bitis.getNano()- baslangic.getNano()));


        LocalTime baslangicSB=LocalTime.now();

        StringBuilder strbd =new StringBuilder("Ahh Java");

        for (int i = 0; i < 10000; i++) {

        //   strbd+=

        }
        LocalTime bitisSB=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilder Zaman :"+(bitisSB.getNano()- baslangicSB.getNano()));






    }
}
