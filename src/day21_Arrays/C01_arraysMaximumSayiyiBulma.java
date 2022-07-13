package day21_Arrays;

public class C01_arraysMaximumSayiyiBulma {

    //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    public static void main(String[] args) {

        int [] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);

    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];
        for (int i = 1; i < sayilar.length; i++) { // 0. degerini yukarida almistik oyuzden tekrar baslatmadik 1. degerden baslattik.
            if( sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }


        System.out.println("Array deki en buyuk sayi :"+maxSayi);




    }

}
