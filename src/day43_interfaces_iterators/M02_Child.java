package day43_interfaces_iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface de abstract olan uc methodu implement ettigimizde java itirazini durdurur.
    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz methodlari
    implement etmememiz sorun olusturmadi

    Ozaman nicin 2 keyword (static ve default ) tanimlanmistir?
     Bu iki farkli kelimenin amaci child classlardan bu method a nasil erisilebilecegini belirlemek icindir.
     static keyword kullanilirsa, child class'dan bu method a erismek icin InterfaceAdi.MethodAdi olur.

     Default keyword kullanilirsa methoda erismek icin obje olusturulmalidir.
     */
    public static void main(String[] args) {


    I01_InterfaceBodyOlanMethod.direksiyon();

    M02_Child obj=new M02_Child();
    obj.teker();



    }
}
