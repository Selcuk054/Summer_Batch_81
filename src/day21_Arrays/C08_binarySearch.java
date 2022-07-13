package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search Javada eleman aramanin kisa yoludur ancak binary search in calismasi icin
        once arrayin sirali hale getirilmesi
        gerekir , aksi takdirde sonucu bulamyabilir yada yanlis bulabilir.
         */


        String[] harfler={"Y","B","S","D","O"};


        String arananHarf= "B";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));


        // binary search bize aradigimiz elemanin indexini dondurur.
        //Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println( Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));



    }
}
