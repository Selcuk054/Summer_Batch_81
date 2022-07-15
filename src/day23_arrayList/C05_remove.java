package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1); //[5, 3, 2, 1]

        sayilar1.remove(1);
        /*
        Sayilardan olusan bir list varsa java remove metodunda sayi yazdigimizda direkt index olarak kabul eder.

         */
        System.out.println(sayilar1); //[5, 2, 1]

        //illada 5 i silmek istersem
       //silinecek objeyi bir variable tanimlayabiliriz

        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1); //[2, 1]

        //veya indexOf metodundan yardim alabilirim

        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1); //[1]






    }
}
