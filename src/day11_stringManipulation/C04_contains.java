package day11_stringManipulation;

import java.util.Locale;

public class C04_contains {
    public static void main(String[] args) {
        /*
        `Soru 2
         */
        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();
        //requirements'te buyuk harf yada kucuk harf hassasiyeti hakkinda birsey soylenmemis.
        // ikinci olarakda her iki kelimeyi icerme durumu aciklanmamis.
        // bu durumda gorevi bize kim verdiyse ona sormak lazim.

        //ek requirments gelsin: ikisini de iceriyorsa "karar ver buyuk mu yazdirayim kucukmu?"
        //Case sensitive olmasin.

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")&&cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim kucukmu");
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
}
