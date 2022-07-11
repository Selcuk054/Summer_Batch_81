package day17_nestedForLoop;

import java.util.Scanner;

public class C09_whileLoopSifre {
    /*  Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar sifre girmesini isteyin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

       */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sifre="";
        boolean sifreBsariliMi=false;
        int kontrol=0;


        while (!sifreBsariliMi){
            //kullanicidan bir sufre alalim
            System.out.println("Lutfen bir sifre giriniz");
            sifre= scanner.nextLine();
            //4 kontrolu yapalim, her gecen

            if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'){
                kontrol++;
            }else{
                System.out.println("Ilk harf buyuk harf olmali");
            }
            if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else{
                System.out.println("Son harf kucuk harf olmali");
            }
            //bosluk kontrolu
            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            }else {
                kontrol++;
            }
            //sifre uzunluk kontrolu
            if (sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            if (kontrol==4) { //tum kontrollerden gecmis demektir
                System.out.println("Sifre basari ile tanimlandi");
                sifreBsariliMi = true;
            } else{ //sifre basarisiz
                    // tekrar basa donecek
                    // kontrol variable sifirlanmali
                kontrol=0;

            }
        }
    }
}

