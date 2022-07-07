package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_doWhileLoop {
    /*
    Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
    yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve girdigi
    pozitif sayilarin toplaminin kac oldugunu yazdirin.
     */

    public static void main(String[] args) {
// neler istendigini basta olusturalim..

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifsayiadedi=0;
        int negSayiAdedi=0;
        int PozSayilarTop=0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tam sayi giriniz");
            sayi= scan.nextInt();
            if(sayi>0){
                PozSayilarTop+=sayi;
                pozitifsayiadedi++;

            }else if (sayi<0){
                negSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }
        }while (sayi!=0);

        System.out.println(pozitifsayiadedi+" adet pozitif sayi girdiniz ;"+PozSayilarTop);
        System.out.println(negSayiAdedi+ " adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");
    }
}
