package day38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exception_Odev {
    public static void main(String[] args) {


    String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};
    Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
    int istenenSira= scan.nextInt();

    while(istenenSira<0 || istenenSira>5){
        System.out.println("Lutfen 1 ile 5 arasinda bir deger giriniz");break;
        }


        System.out.println("Program calismaya devam ediyor");
        try {
            System.out.println("aradiginiz urun : "+ urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+
                    "\n Sira numarasi en fazla 5 olabilir");
        }
}
}