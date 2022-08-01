package day37_overridding;

public class FSupra extends EToyota{



    void yakit(){

        System.out.println("Supra Benzin kullanir");

        /*
        Private methodlar override edilemez. Eger child class da parent class daki private method
        ile ayni signiture da bir methode olusturursaniz bu overridding method olmaz.
         */
    }

    @Override
    void motor() {
        System.out.println("Sirali 6 silirndir csgs motoru kullanir");
        /*
        Override notasyonu Java ya bir gorev verir
        Java bu notasyonla birbirine bagli olan iki methodu surekli kontrol eder
        Eger parent class daki overridden method u silerseniz CTE verir.

        Override notasyonu kullanmak mecburi degildir
        Eger overridding method silinirse kodun cte Vermesini istersek @override notasyonu kullanmaliyiz
         */
    }
}
