package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        int          not              =                60                  ;
        //data turu    vatiable ismi  assignment sign   variable degeri  islem bitti isareti
        int not2   =      70;
        //  variable         deger
        // java once degeri hesaplar sonra assign islemini yapar
        // not2'yi 80 yapalim
        not2=80;
        // yeni bir int variable olusturalim degeri ilk iki variable'in ortalamasi olsun
        int ort = (not + not2) /2 ;
        System.out.println(ort);
        //  " " icinde yazilan hersey metindir, Java " " icinde ne gorurse o sekilde yazdirir
        // eger bir variable'in degerini yazdirmak istiyorsaniz
        // " " olmadan variable ismini yazmalisiniz
    }
}
