package day14_methodCreation;

import day13_methodCreation.C01_stringManipulation;
import day13_methodCreation.C04_MethodCreation;

public class C02_methodCreation {
    //verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim.
    public static void main(String[] args) {
        int input=423;

        rakamlariTopla(input);
        rakamlariTopla(input);
        C04_MethodCreation.topla(7,20);
        C01_methodCreation.terstenYazdir("Nuri");

    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi =input%10;
        rakamlarToplami+=birlerBasamagi;
        input/= 10;
        birlerBasamagi =input%10;
        rakamlarToplami+=birlerBasamagi;
        input/= 10;
        birlerBasamagi =input%10;
        rakamlarToplami+=birlerBasamagi;
        input/= 10;

        System.out.println("Rakamlar toplami :"+ rakamlarToplami);

    }
}
