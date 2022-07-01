package day08_ifStatements;

import java.util.Scanner;

public class C02_ifElseifStatements {
    public static void main(String[] args) {
         /*
    Kullanıcıdan 100 üzerinden notunu isteyin. Not'u harf sistemine çevirip yazdırın.
    50'den kucukse "D",
    50-60 arasi"C",
    60-80 arası"B",
    80'nin uzerinde ise "A"
    gecersiz not girildiginde uyari verelim.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz ");
        double note= scan.nextDouble();

        if (note<0 || note>100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        }  // bu satira geldiysek notumuz 0 ile 100 arasindadir.
        else if(note<50){
            System.out.println("Notunu : D");
        }
        else if(note<60){
            System.out.println("Notunuz :C");
        }
        else if (note<80){
            System.out.println("Notunuz :B");
        }else {
            System.out.println("Notunuz :A");
        }





    }
}
