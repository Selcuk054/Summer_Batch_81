package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_forEachLoop {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        //Arraydeki tum elemanlari inceleyelim tek sayi olanlari liste atalim.

        for (int each:arr  //gelcek datalrin turu,--- loop icinde ne isim verdigim --- nereden aldigim.
             ) {

            if (each%2==1){
                liste.add(each);
            }

        }
        System.out.println(liste);
    }
}
