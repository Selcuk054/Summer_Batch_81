package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfElse {
   /* Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
    */
   //ilk har buyukmu kucukmu?
   //ilk harf buyu a veya kucuk z mi?

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("lutfen sifre giriniz");
      String sifre = scan.next();
      char ilkHarf = sifre.charAt(0);
      if (ilkHarf >= 'A' && ilkHarf <= 'Z') {//ilk harfi buyuk harf olan kelimeler
         if (ilkHarf == 'A') {
            System.out.println("Gecerli sifre");

         }else {
            System.out.println("Gecersiz sifre");
         }
      } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {//ilk harf kucukharf

         if (ilkHarf == 'z') {
            System.out.println("Gecerli sifre");
         } else {
            System.out.println("gecersiz sifre");
         }
      } else {
         System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
      }

   }
}