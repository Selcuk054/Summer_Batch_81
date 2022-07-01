package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // soru 3- Kullanicidan bir sayi alin ve sayinin mutlakdegerini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0? sayi : (-1*sayi));


    }

}
