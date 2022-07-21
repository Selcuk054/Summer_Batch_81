package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 li indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=30;

        double indirimliFiyat= indirimliFiyatHesapla(satisFiyati, indirimOrani);
        System.out.println("Indirimlifiyat :"+indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {
        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;

    }
}
