package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan tamsayilar alin kullanici cift sayi girdigi muddetce
        sayilari yazdirin tek sayi girdiginde islemi bitirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        //while ile yapalim
        //Loolarda kullanacagimiz variable lari looptan once olusturmaliyiz!!
        //while loop da loop dan oonce olusturdugumuz bu variable a atayacsagimiz
        // degeri iyi dusunmemiz gerekiyor



        while(sayi%2==0) {

            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girlen sayi cift :" + sayi);
            } else {
                System.out.println("Girilen sayi tek ve kapaniyorum");

            }
        }

        //do while ile yapalim
        // do while loop da onceden olusturulan variable a hangi deger atandiginin hicbir ondemi yok.
        //kodumuz her durumd calisir.
        /*
        do while in dezavantaji:
        ilk calistirma kontrol yapilmadan oldugu icin loop un body sinde yanlis
        bir islem yapilmamasina dikkat etmek gerekir.
         */

        do{

            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girlen sayi cift :" + sayi);
            } else {
                System.out.println("Girilen sayi tek ve kapaniyorum");

            }



        }while(sayi%2==0);





    }
}
