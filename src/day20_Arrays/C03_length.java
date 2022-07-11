package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki sekilde Array olusturabiliriz
        int sayilar[]={1,2,3}; //suslu parantez..

        //direk olusturmuyorsam

        String harfler[]=new String[4]; //koseli parantez

        System.out.println("Sayilar Array inin uzunlugu :"+sayilar.length); //3
        //String length() methodunda parantez var Array de yok.


        System.out.println("Harfler Array inin uzunlugu :"+ harfler.length);//4

        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]

        //harfler array inin son elementini yazdirin.

        System.out.println(harfler[harfler.length-1]); //null

        System.out.println(harfler[5]);// ArrayIndexOutOfBoundsException hatasi



    }
}
