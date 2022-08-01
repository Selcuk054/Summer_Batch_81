package day34_inheritance;

public class Isci extends Personel {

    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir.
    Javada ise child class lar ozelliklerini inherit etmek
    istedikleri class i kendilerine parent ediirler.

    Mesela isci class ini olusturunca nelere ihityaci var diye dusunsek personel class indaki tum
    variable ve methodlara ihtiyaci oldugunu gorebiliriz.
    Bu durumda yeniden o variable lari ve metidlari olusturmakk yerine
    Personel class ini kendimize parent ediniriz.

    Bir class i parent edinmek icin 'extends keyword' kullanmaliyiz

    Bir class baska bir oclass i paren edindiginde
    1- parent class daki tum ozelliklere (variable+method) otomatik olarak sahip olur
    2- Parent class daki ozelliklerden bazilarini kendine uyarlayabilir.
    3- Parent class da olmayan bazi yeni ozellikler olusturabilir.
    not: Parent class daki ozelliklerden hicbiriniz reddemez ama degistirebilir.
     */

    int persNo=1001;

    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim); // isim Belirtilmedi
        //Kendi class imizda isim variable yok oyuzden parent a gider.
        isci1.isim="Selim";
        System.out.println(isci1.persNo); // 1001 kendi class imizda varsa onu kullaniriz.

        isci1.maas(); //Tum personelin maasi vardir


    }
    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }
    public void ozelSigorta(){

    }
}
