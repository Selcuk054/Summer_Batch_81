package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    /*
    Binary search metodu siralanmis array de aradigimiz elemenin indexini dondurur
    Ya aradigimiz element arrayde yoksa?
    (String de indexof() bize olmayan elementler icin -1 donduruyordu)

    Aradigimz element arrayda yoksa java hem olmadigini hemde olsaydi nerede olacagini
    bize dondurur.

    olmadigini iade icin - kullanir olsaydi nerede olacagini belirtmek icin index degil siralama kullanir.

    !!! Varsa index Yoksa siralama!!!!
     */
    public static void main(String[] args) {
        int[] sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[3, 4, 7, 10, 15, 27]

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1
        System.out.println(Arrays.binarySearch(sayilar,15)); //4
        System.out.println(Arrays.binarySearch(sayilar,11));  // -5
        System.out.println(Arrays.binarySearch(sayilar,6));  // -3
        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1

    }
}
