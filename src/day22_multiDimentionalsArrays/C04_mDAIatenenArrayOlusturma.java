package day22_multiDimentionalsArrays;

import java.util.Arrays;

public class C04_mDAIatenenArrayOlusturma {
    /*
    Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum
    elemanlarin toplamini  birer birer bulan ve herbir sonucu yeni bir array’in
    elemani yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz
    { {1,2,3}, {4,5}, {6,7} }

    Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

     */
    public static void main(String[] args) {

        int[][] input={ {1,2,3}, {4,5}, {6,7} };
        int[] yeniArray=new int[input.length];
        int toplam=0;

        for (int i = 0; i < input.length ; i++) { //dis loop outer array i gezer
            for (int j = 0; j <input[i].length ; j++) { //ic loop inner arrayleri gezer

                toplam+=input[i][j];




            }
            yeniArray[i]=toplam;
            toplam=0;
        }
        System.out.println("Istenen yeni array ;"+ Arrays.toString(yeniArray));

    }

}
