package day22_multiDimentionalsArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        Array i array yapan sembol koseli parantez [] arraylistte ise <> diamond(elmas) kullaniriz.

         */

    List<String > isimler=new ArrayList<>();
        System.out.println(isimler);// []
        //bir list e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse"));// true doner




    /*
    Stringde bir metod calistirdigimizda assign yapmazsak String degismiyordu.
    String isim="Suleyman"
    isim.toUpperCase(); //SULEYMAN
    sout(isim)//Suleyman.

     */
        System.out.println(isimler);//[Basak, Ayse]

        /*
        list in tek kotu tarafi array altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir.
         */


    }
}
