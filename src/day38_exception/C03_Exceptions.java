package day38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim
         */
        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenSira=0;

        try {
            istenenSira =scan.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Program calismaya devam ediyor");


        /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)

         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz bu objeyi kullanabilirsiniz

         Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */
        try {
            System.out.println("aradiginiz urun : "+ urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+
                    "\n Sira numarasi en fazla 5 olabilir");
        }
        // Iki hatayi tek try catch in icinde kullanmak mantikli degildir cunku herbirinin hatasi kendine ozgudur,


    }
}
