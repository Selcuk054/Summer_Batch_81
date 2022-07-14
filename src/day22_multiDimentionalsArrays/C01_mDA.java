package day22_multiDimentionalsArrays;

import java.util.Arrays;

public class C01_mDA {
    public static void main(String[] args) {

        /*//tek katli arraylerde arrayi direk yazdiramiyoruz.
       // cunku array non primitive dat turudur her
        // non primitive data ture herzaman yazdirilamayabilir
        Ancak arrayin icerisindeki elementleri direkt yazdirabiliyorduk.
        cunku genelde primitive data turu veya String elementler kullaniliyordu.
        Multi dimensional arraylerde en dikkat edecegimiz konu ulasmak istedigimiz
        elementin bir array mi yoksa primitive data mi oldugudur.
         */

        int[][] sayilar= {{1,2,3,4},{5,7}};
        /*
        burada sayilar araayinin icinde 2 tane inner array var
        sayilar[0] ==> [1,2,3,4]

        anck en icerdeki elementlere ulasursak direk yazdirabiliriz.
         */
        System.out.println(sayilar[0]);//[I@4f023edb
        System.out.println(Arrays.toString(sayilar[0])); //[1, 2, 3, 4]

        System.out.println(sayilar[0][1]); //2
        System.out.println(sayilar[1][0]); //5
        System.out.println(Arrays.toString(sayilar));// [[I@4f023edb, [I@3a71f4dd]
        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 3, 4], [5, 7]]

        /*
        Arrayi iki sekilde declare edebiliyorduk
        1- elemanlari direk yazabiliryoruz
        in[] [] sayilar= {{1,2,3,4}}         */

    }
}
