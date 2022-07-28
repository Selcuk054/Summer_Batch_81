package day33_encapsulation;

public class Ogretmen {

    private String isim;
    private String soyisim;
    private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    /*
    bazen de yetkileri sinrlamak degilde yapilan isi daha iyi tanimlamak icin
    encapsulation kullanilir.

    Bu yaklasimi kullanan class larda tum variable lar private yapilip hepsi icin getter ve setter olussturulur.

     */
}
