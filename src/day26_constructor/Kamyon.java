package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String Marka, String Model, int Yil, int Fiyat) {
        marka=marka;
        model=model;
        yil=yil;
        fiyat=fiyat;

        /*
        Bizim temel amacimiz Kamyon Runner da orgument olarak girilen degerin
        Kamyon class inda instance variable a atanmasi.
        Ancak scope konusunda ogrendigimiz gibi Kamyon canstructor
        scope unda marka oldugu icin instance marka'ya gitmiyor.

        Bu karisikligi gidermek icin instance variable lari belirli hale getirmemiz lazim.
        java bunu icin this keyword olusturmustur.

        Genel kullanim acisindan this keyword u kodu herkesin anlamasini kolaylastirdigi icin
        tercih edilir..
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\n marka='" + marka +
                "\n model='" + model +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat;
    }
}
