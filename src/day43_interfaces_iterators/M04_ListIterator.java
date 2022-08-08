package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {
        /*
        ListIterator Iterator  interfaceinin child interface idir. amadaha cok method a sahiptir.
         */
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        Integer temp;
        ListIterator list1=liste.listIterator();

        while (list1.hasNext()){
            temp=(Integer) list1.next()+3;

            list1.set(temp);
        }
        System.out.println(liste);
    }
}
