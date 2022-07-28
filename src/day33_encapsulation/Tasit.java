package day33_encapsulation;

public class Tasit {
    private String tasitTuru= "Tir";
    private boolean muayeneVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    // Getter methodu da tek bir satirlik islem yapiyor
    // baska class'larinprivate oldugu icin erisemedigi tasit turu
    //bilgisini turu bilgisini class icinden alip istenen
    // farkli class'lara return ediyor.

    public boolean isMuayeneVarMi() {
        return muayeneVarMi;
    }
    //Boolean variable lar icin olusturulan geter mehodlarinin ismi
    //isVariableIsmi seklinde olur.

    public void setMuayeneVarMi(boolean muayeneVarMi) {
        this.muayeneVarMi = muayeneVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
