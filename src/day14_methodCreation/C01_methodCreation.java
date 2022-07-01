package day14_methodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C01_methodCreation {
    /* Tekrar;
    1- Methodlar belirli bir isi yapmak uzere hazirladigimiz kod bloklaridir(Robot gibi)
    Method yazmak tek basina istenen isi main method da yapmaktan zor olabilir ama method kullanmak komplex
    programlar icin cok avantajli oludugundan tercih edilir.
    - Method u bir kere yazdiktan sonra istedigimiz yerden, istedigimiz kadar kullanabilriiz.
    -Bu koda her ihtiyacimiz oldugunda yeniden kod yazmak veya bu kodu nasil yazabilecegimizi
    dusunmekten kurtuluruz
    -Denenmis oldugu icin tekrar ihtiyac oldugunda yeniden yazacagim kodlarda ortaya cikabilecek sorunlarla karsilasmayiz
    -Write once,use everytime.
    -Method ismi verilirken yaptigi is ile ilgili bir isim verilirse asil klasimiz daha anlasilir ve temiz (clear) olur.
    2- Genel olarak method lar iki sekilde olur.
    -Rturn type i void olanlar bize bir sonuc dondurmez sonucu yazdirmak veya bir yere kaydetmek gibi islevler yapabilirler
    (Fatura yazdiran cocuklar)
    - Return type void olmayanlar bize bir sonuc dondururler (ekmek almaya gonderdigimiz kapici gibi)
    sadece methodun calismasi yetmez, donen sonucu kaydetmeniz gerekir.
     */

    public static void main(String[] args) {
        // input olarak verilen dort harfli bir string i tersten yazdiran bir method olusturalim.
        terstenYazdir("Okan");
        C04_MethodCreation.topla(6,5); //11


    }
    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazilisi :"+tersInput);

    }
}

