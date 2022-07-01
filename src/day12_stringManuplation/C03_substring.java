package day12_stringManuplation;

public class C03_substring {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartno= "1234 7463 7637 8473";

        System.out.println(isim.substring(3));//eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //fil

        System.out.println(isim.substring(2,4)); // le

        //isim ve soyismin ilk harfi buyuk harf,geriye kalan yildiz*
        //kredi kartinin ilk 4 rakami gorunsun geri kalani yildiz*

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");

        String soyIsimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");
        String kkIlk4=kartno.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "
                +soyIsimIlkHarf+soyIsimGeriyeKalanlar+"\n"+kkIlk4+kkGeriyeKalanlar);

    }
}
