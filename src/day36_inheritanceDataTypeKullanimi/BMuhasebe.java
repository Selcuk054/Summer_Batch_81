package day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonal {
    protected  int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){
        System.out.println("Personal minimum : "+ (30*gunlukMesai*saatUcreti)+" maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }
}
