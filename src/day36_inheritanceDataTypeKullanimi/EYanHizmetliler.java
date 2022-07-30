package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;


    protected void maas() {
        System.out.println("Yan hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan hizmetliler %30 indirimli isszlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {

        /*
        Overriding child class daki bir methodun parent class daki ayni isimdeki methodu etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding i nerede dikkate alliyoruz?
        bir obje olusturulurken data turu ve constructor farkli ise

        eger bir obje olusturulurken data turu ve constructor farkli ise objenun
        ozellikerini belirlerken 3 konuya dikkat etmeliyiz
        1- obje contructorun oldugu class da olusur,
        2- objenin ozelliklerini aramaya data turunun oldugu class dan baslariz bu class da aranan ozellik bulunamazsa
        parent class lara bakilir oradada bulamazsa CTE verir.

        eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.
        3- Aranan ozellik method ise degeri yzdirmadan once override edilmismi diye kontrol etmemiz gerekir (yani etkisiz hale getirilmi mi diye)
        Eger override edildiyse en guncel degeri yazdiririz.

         */

        BMuhasebe yh1=new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai);//  M 8
        System.out.println(yh1.saatUcreti);// M 10
        yh1.maas(); // YH override?
        yh1.ozelSigorta();// M
        yh1.sigorta();// P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyisim);//P
        System.out.println(yh1.departmant); //

       // System.out.println(yh1.issizlikSigorta);// CTE
        /*Aramaya muhasebeden basladigimizdan issizlikSigortasi bulamadik CTE

         */






    }
}
