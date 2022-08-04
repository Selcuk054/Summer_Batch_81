package day38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exception_Odev {
    public static void main(String[] args) {


    String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};

    Scanner scan;

    int istenenSira=0;
    boolean kontrol=true;

    while(kontrol){
        try {
            scan= new Scanner(System.in);
            System.out.println("Istediginiz urunun sira nosunu giriniz");
            istenenSira= scan.nextInt();
            kontrol=false;
        }catch (InputMismatchException e){
            System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
        }
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