package day38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception_Q {

    public static void main(String[] args) {
        String [] market={"Bulgur","Domates","Peynir","Makarna","Tereyagi"};
        System.out.println("Lutfen bir urun nosunu giriniz");
        Scanner scan=new Scanner(System.in);
        int no= 0;

        try {
            no = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Java ustteki hatayi aldi ve lutfen 1 ile 5 arasinda bir deger giriniz");
        }

        try {
            System.out.println("Aradiginiz urun : "+ market[no-1]); //Indexini yazdirdigimiz icin
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girilen deger yanlis oldugu icin java hata verdi fakat yoluna devam ediyor");
        }


    }

}
