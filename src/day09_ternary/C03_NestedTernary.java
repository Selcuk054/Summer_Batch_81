package day09_ternary;

import java.util.Scanner;

public class C03_NestedTernary {
    public static void main(String[] args) {
        // Soru2 : Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        /*
        String sonuc= (harf>='a' && harf <='z') ? ("Kucuk Harf") :
                ("Buyuk harf veya gecersiz karakter");
         */
        String sonuc = (harf >= 'a' && harf <= 'z') ? ("Kucuk Harf") :
                ((harf >= 'A' && harf <= 'Z') ? "Buyuk harf" : "Gecersiz karakter");
        String sonuc2 = harf >= 'a' && harf <= 'z' ? "Kucuk Harf" :
                harf >= 'A' && harf <= 'Z' ? "Buyuk harf" : "Gecersiz karakter";
        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}
