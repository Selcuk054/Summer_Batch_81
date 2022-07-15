package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_arraydenListYapma {
    public static void main(String[] args) {

        /*
        List ile calisirken en kotu ozelligi elemanlari tek tek eklemek.
         */

        Integer[] arr={2,3,4,5,6,8,4,5,3,2,1,5,6,8,7};

        // bukadar cok elemanli bir listeyi tektek eleman olarak girmek yerine
        //array olusturup forLoop ile olsturdugumuz List e tasiyabiliriz.

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); //[2, 3, 4, 5, 6, 8, 4, 5, 3, 2, 1, 5, 6, 8, 7]

        /*
        Bu islemi yapmasi cin javanin olusturdugu bir method da var ancak bu yontemin cok yan etkisi var.

        1- Bu sekilde olusturulan listede add, remove gibi size i degistiren metodlar kullanilamaz.
        2- aslist metodu ile olusturulan liste ve kaynak olan array birbiri ile ilisik olarak hayatlaina devam ederler
        birinde yaptigimiz degisikli otomatik olarak dierinede isler.
         */

        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 4, 5, 6, 8, 4, 5, 3, 2, 1, 5, 6, 8, 7]

        sayilar.add(5);
        System.out.println(sayilar);//[2, 3, 4, 5, 6, 8, 4, 5, 3, 2, 1, 5, 6, 8, 7, 5]

       // sayilar2.add(5);
      //  System.out.println(sayilar2); //UnsupportedOperationException verdigi icin yoruma aldik

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 4, 5, 6, 8, 4, 5, 3, 2, 1, 5, 6, 8, 7]

        System.out.println("arrayde degisiklik yapinca sayilar2 :"+sayilar2);



    }
}
