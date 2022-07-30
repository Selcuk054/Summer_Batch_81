package day36_inheritanceDataTypeKullanimi;

public class APersonal {
    protected String isim ="Isim belirtilmedi";
    protected String soyisim="Soyisim Belirtilmedi";
    protected String departmant= "Departmant belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }
    protected void sigorta(){
        System.out.println("Tum personelimiz sigortalidir");
    }

}
