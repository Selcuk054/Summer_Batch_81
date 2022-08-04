package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Soru ; Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        Exception verecek sekilde yazin.
         */

        System.out.println("Lutfen yasiniz giriniz");
        Scanner scan=new Scanner(System.in);
        int yas= scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();

            }else {
                System.out.println("Yasiniz : "+ yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz"); //err ciktida kirmizi yazdiriyor
        }

    }
}
