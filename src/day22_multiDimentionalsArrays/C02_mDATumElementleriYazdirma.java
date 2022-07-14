package day22_multiDimentionalsArrays;

public class C02_mDATumElementleriYazdirma {
    //Verilen bir multi dimensional array in tum elementlerini yazdiran  bir method hazirlayalim.

    public static void main(String[] args) {


    int [][] sayilar={{1,5,6,9},{2,5,5,8},{3,1,6}};


    elementleriYazdir(sayilar);




}

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length; i++) { //i=0,1,2, degeleri olacak
            for (int j = 0; j < sayilar[i].length; j++) {// inner arraylaerin uzunluguna bagladik
                System.out.print(sayilar[i][j] + " "); // 1 5 6 9 2 5 5 8 3 1 6

            }

        }


    }
}