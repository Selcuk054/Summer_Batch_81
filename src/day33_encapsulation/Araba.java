package day33_encapsulation;

public class Araba {

    String marka= "Marka Belirtilmedi"; //Markanin acces modifier i default acces modifier oldugundan
                                        //package icerisinde kullanilabilir.
    private String model= "Model Belirtilmedi";
    private String yakit= "Elekrikli"; //tum arabalar elektrikli ise bu variable in degistirilmemesi lazim.
    //private yaptigimiz model ve yakit variable larina erisim i yetkilendirelim//
    //model e deger atanabilsin ama gorulemesin(setter)
    //yakiti ise gorelim ama degistiremeyelim yani deger atamasin isteniyor (getter)


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
