package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);
        //listedeki tum elementleri INDEX KULLANMADAN 3 artirin

        for(Integer each:liste
        ){
            System.out.print(each +3+" ");

        }
        System.out.println(" ");
        System.out.println(liste);

        /*
        Java index yapisi olmayan collection lardaki elementlere ulasmak ve degisrtirmek icin Iterator
        interface ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun edgildir. bunun yerine bize iterator donduren
        liste.iterator methodunu kullaniyoruz
         */

        Iterator it1=liste.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//

        /*
        Iterator de geri donus yok adim adim sona ulastiktan sonra basa gelmek
        isterseniz yeniden bir iterator  olusturmaniz gerekir.
         */

        //while (it1.hasNext()){

        Iterator it2=liste.iterator();

        //yeni it2 yi kullanarak listenin tum elementlerini silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); //iterator ile elementleri gezip remove yaptigimizda
                                   //liste kalici olarak degisti.

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        System.out.println("yeniden liste :" +liste);

        Iterator it3=liste.iterator();
        while(it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("Loopdan sonra liste : "+liste);

        /*
        Goruldugu gibi iterator kullanrak yapabildigim
        1- tum collection elementlerini yazdirmak
        2-tum collection elementlerini silmek
        buda bize yetmez
         */


        }

    }

