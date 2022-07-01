package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
       // Soru4 ) Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi =scan.nextDouble();
       // double sonuc = sayi>0 ? "Sayi Pozitif" :(sayi*sayi)

                //eger ternary icindeki sonuzlar farkli data turlerinde ise atama yazamayiz sadece yazdirabiliriz.
        System.out.println(sayi>0? "Sayi Pozitif" : (sayi*sayi));

    }
}
