package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {


        int[] sayilar={5,1,8,2,3,4,7,7,1};

        //Array i Arrays class ini kullanarak natural sirali hale getirebiliriz.

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[1, 1, 2, 3, 4, 5, 7, 7, 8]


    }
}
