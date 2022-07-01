package day09_ternary;

import java.util.Scanner;

public class C06_Switch_Case {
    public static void main(String[] args) {
        /*
        kullaniciddan gun ismini alin hafta ici veya hafta sonu oldugunu yazdirin.

         */

        String input="pazar" ;
        input=input.toLowerCase();

        switch (input){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma": System.out.println("Haftaici"); break;
            case "cumartesi":
            case "pazar": System.out.println("Haftasonu"); break;
            default: System.out.println("Lutfen gecerli bir gun giriniz"); break;
        }



    }
}
