package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

   protected int saatUcreti=12;
   protected int gunlukMesai=9;


    protected void maas() {
        System.out.println("Memurlar : "+ (30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void OzelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas(); //memular 3240 maas alir
        mmr1.ozelSigorta();
        mmr1.sigorta();//per
        System.out.println(mmr1.isim);// per
        System.out.println(mmr1.soyisim);//per
        System.out.println(mmr1.departmant);//per

        BMuhasebe mhsb1=new BMuhasebe();

        /*
        Her nekadar memur class inin icinde olsak da olusturdugumuz obje Muhasebe class indan.
        cunku data turu ve constructor BMuhasebe dir.

        String str="Murat";
        //Her class ayni zamanda bir data turudur.
        ArrayList<Integer> list= new ArrayList<>();
        Integer sayi=20;

        BMuhasebe calss i da obje olusturulabilen bir class dir yani data turudur.

        */

        System.out.println(mhsb1.gunlukMesai);//
        System.out.println(mhsb1.saatUcreti);//
        mhsb1.maas();
        mhsb1.ozelSigorta();
        mhsb1.sigorta();//
        System.out.println(mhsb1.isim);//
        System.out.println(mhsb1.soyisim);//
        System.out.println(mhsb1.departmant);//

    }
}
