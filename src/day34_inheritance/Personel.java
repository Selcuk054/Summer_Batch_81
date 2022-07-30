package day34_inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladiginiz bir class varsa
    veya ilerde bu class i parent class yapmak isteyenler olabili diyorsaniz
    variable ve methodlarin access modifier ini protected
     */

    int persNo;
    String isim="isim Belirtilmedi";
    String departman="Departman belirtilmedi";

    protected void maas(){

        System.out.println("Tum personelin maasi vardir");
    }

   protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");

    }

    protected void FazlaMesaiUcreti(){
        System.out.println("Personel fazla mesaisini statusune gore alir");
    }


}
