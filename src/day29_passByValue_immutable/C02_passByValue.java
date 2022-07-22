package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {

        /*
        Birden fazla eleman iceren array ve arraylist gibi yapilarda passByValue gecerlisir.

        Eger methodda array veya list in kendisi degistirilirse pasbyValue ozelligi sebeiyle
        java degisen degeri degil array veya listin orijinal degerini alir.

        ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
        Java obje degismedigi icin(referans ayni)
         ayni array veya list i bize dondurur. ancak icindekiler degismis olacaktir.
         */
        /*
        Verilen 4 elemanli bir array i methoda gonderelim methodda yeni 3 elemanli bir array atayip
        bu yeni array e rastgele 3 100 den kucuk 3 sayi atayalim
        methoddaarray i yazdiralim

        main methodda da mehod call dan sonra yeniden methodu yazdiralim.
         */

        int[] arr={3,5,8,10};

        arrayiDegistir(arr);
        System.out.println("method call dan sonra main methodda array :"+ Arrays.toString(arr));


    }

    public static void arrayiDegistir(int[] arr) {

        arr=new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("methodda array :"+ Arrays.toString(arr));


    }
}
