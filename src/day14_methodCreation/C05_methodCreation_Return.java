package day14_methodCreation;

import java.util.Scanner;

public class C05_methodCreation_Return {
    public static void main(String[] args) {
        /* Eger bir class in icerisinde herhangi bir hesaplama yapip bunuda kalici olarak saklamak istersek
        kodumuzu sade ve anlasilabilri tutmak icin islemi bir methodda yapip sonucunu main methoda dondurebiliriz.
        BU durumda return type i void olmayan sonucunu main methodda bir variable a atama yaparsak
        programin geri kalaninda bu yeni degeri kulanma sansimiz olur.

         */



        //Kullanicidan sehir ismini ve dogum tarihini alalim.
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun.
        // sehir ismini progremimizda buyuk harf olarak
        //tarihi iste 2022=06-30 seklinde kullanmak istiyoruz.

        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("Girdiginiz sehir :"+sehir); //Girdiginiz sehir :İSTANBUL
        System.out.println("Girdiginiz tarih :"+tarih); //Girdiginiz tarih :2012-02-09



    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Yil Giriniz");
        int yil= scan.nextInt();
        if (yil>1900 || yil<2100){
            tarih=yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazmalisinizi(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu yaziniz");
        int ay=scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else{
            tarih=tarih+ay+"-";
        }
        System.out.println("Lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun=scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("Gun olarak 1-31 arasinda sayi girilmelidir");
        }else if(gun<10){
            tarih=tarih+"0"+gun;
        }
        return tarih;



    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi = scan.next().toUpperCase();

        return sehirAdi;


    }
}
