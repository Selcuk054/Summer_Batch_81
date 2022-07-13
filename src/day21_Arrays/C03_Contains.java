package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan aldiginiz bir ismin bir arrayda olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */

        String [] isimler={"Basak","Nurullah","Fatih","Adem","Enes" };
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aradiginiz ismi giriniz");
        String arananKelime=scan.nextLine();

        boolean sonuc= contains(isimler,arananKelime);
        if (sonuc){
            System.out.println("Girilen isim listede vardir");
        }else {
            System.out.println("girilen isim listede yok");
        }


    }

    public static boolean contains(String[] isimler, String arananKelime) {

        boolean sonucMethod=false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananKelime)){
                sonucMethod=true;
            }

        }
        return sonucMethod;
    }
}
