package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));// 90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati)); //

    }


    public static double indirimliFiyat(double orijinalFiyat){
        //methodumuz yuzde 10 indirim yapip yeni fiyati main methoda dondursun.

        double satisFiyati=orijinalFiyat*0.9;

        return orijinalFiyat*0.9;

    }


}
