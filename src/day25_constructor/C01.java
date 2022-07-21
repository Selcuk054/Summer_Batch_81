package day25_constructor;

public class C01 {

    // Java oop conjept kullandigi icin olusturulan her bir class in ihtiyac
    //oldugunda obje uretebilmesine uygun dizayn etmis.
    // Bunun icin java ihitac halinde kullanilmasi icin her class da default bir constructor koymustur.


    // bu default constructor class dan obje olusturuldugunda otomatik olarak calisir.

    //ornegin bu class da constructor gorunmemesine ragmen C02 Class inda icinde
    // oldugumuz C01 class indan bir obje uretebildik

    int sayi;
    public void deneme(){
        System.out.println("C01 den deneme methodu calistir");
    }
}
