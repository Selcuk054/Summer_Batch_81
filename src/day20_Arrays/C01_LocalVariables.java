package day20_Arrays;

public class C01_LocalVariables {

    public static void main(String[] args) {

        int sayi=10;
       // System.out.println(sayiMethod);//Sayi method method1 ile olusturulmus local variables dir

        for (int i = 0; i <20; i++) {
            System.out.println(i);

        }
        // System.out.println(i); i loop da olusturulmus variable dir
        //sadece loop icerisinde kullanilabilir

        //static int sayiStatic=20; statik modifire keyword sadece class level da kullanilabilir.
        //methodlarin icerisinde static variable tanimlanamaz.





    }

    public static void method1(){

        //System.out.println(sayi);  sayi main medhodda olustuturulmus local bir variables dir
        // ve sadece main method da gecerlidir

        int sayiMethod=20;
    }

}
