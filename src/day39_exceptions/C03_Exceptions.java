package day39_exceptions;

public class C03_Exceptions {

    public static void main(String[] args) {
        String str ="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sdece rakamlardan olusmalidir");
        }
            catch (Exception e) {
                System.out.println("Ongorulemeyen bir hata olustu");

        }
        System.out.println("sayinin karesi : "+(sayi*sayi));



        /*
        Kullanicidan String olarak bir deger aliyor ve bunu int ceviriyorsak NumberFormatException (NFE)
        ile karsilasabilecegimizi ongorebiliriz. NFE aldigimizda kodumuzun durmasini istemiyorsak try catch ile
        cevreleyebiliriz.
        Eger bilmedigim nir exception daha olusursa kodum durmasin istiyorsak bir kere daha catch cumlesi ekleyip
        onaen genis Exception u yazabiliriz.
         */
    }
}
