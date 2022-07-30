package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){

        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+ " maas alir");

    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isci1=new DIsci();
        /*
        Bir obje olusturulurken data turu ve constructor ayni class dan ise direkt o class'a gidiyorduk.

        Eger data turu ve constructor farkli ise;
        Obje Contructor un oldugu class in objesidir ancak bu durumda bizden istenen
        isci class indaki ozellikler spesifik ozellikler degil. Bir iscinin muhasebe class indaki tum calisanlarla sahip
        oldugu genel ozelliklerdir.

         */
        System.out.println(isci1.gunlukMesai);// muhasebeden 8
        System.out.println(isci1.saatUcreti);// muh. 10
        isci1.maas(); // muh.
        isci1.ozelSigorta();// muh
        isci1.sigorta();//personel
        System.out.println(isci1.isim);//per
        System.out.println(isci1.soyisim);//per
        System.out.println(isci1.departmant);// per

        APersonal isc2=new DIsci();

       // System.out.println(isc2.gunlukMesai);// muhasebeden 8
      //  System.out.println(isc2.gunlukMesai);// muh. 10
          isc2.maas(); // muh
      //  isc2.ozelSigorta();// muh
        isc2.sigorta();//personel
        System.out.println(isc2.isim);//per
        System.out.println(isc2.soyisim);//per
        System.out.println(isc2.departmant);// per

        /*
        Eger data turu olan class da aradigimiz ozellik varsa onun parentina gidebilir ama child a donus olmaz.
        Aradigi ozelligi bulamazsa CTE verir (Compile time error)

         */

        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Deque<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */





    }
}
