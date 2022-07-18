package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_tekraredenSayilar {
    public static void main(String[] args) {
        //Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr = {1, 2, 3, 4, 6, 8, 9, 5, 6, 4, 6, 7, 8, 5, 4, 4, 4};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        List<Integer> tekrarEdenler = new ArrayList<>();


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && tekrarEdenler.contains(arr[i])) ;{
                System.out.print(arr[i] + " ");

            }


        }


            }
        }
