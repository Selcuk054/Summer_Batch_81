package day25_constructer;

public class C01 {

    // Java oop conjept kullandigi icin olusturulan her bir class in ihtiyac
    //olduguna obje uretebilmesine uygun dizayn etmis.
    // bunun icin java ihitac halinde kullanilmasi icin her class da default bir constructor koymustur.


    // bu default constructor class dan obje olusturuldugunda otomatik olarak calisir.

    //ornegin bu class da constructor gorunmemesine ragmen C02 Class inda icinde
    // oldugumuz C01 class indan
    int sayi;
    public void deneme(){
        System.out.println("C01 den deneme methodu calistir");
    }
}
