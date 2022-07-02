package day15_Overloading_ForLoop;

public class C02_Overloading {

    public static void main(String[] args) {
        /*
        Javada olusturdugumuz method larin isminin yaptigi isler ile uyumlu olmasini isteriz
        mesela bir string in bir bolumunu alamk icin java 2 adet substring () metodlari veya
        verilen stringdeki bazi parcalari yenileriyle degistirmek icin 2 adet replace() methodu var.

        Java ayni isimde birden fazla method varsa hangisinin kullanilacagina [aramatre sayisi ve
        parametrelerin data turune gore karar verir.
         */

        String str="Bu java ogrenilecek baska yolu yok";
        str.substring(2);

        str.replace('c','v');
        str.replace("J","H");
        //str.replace(5,8)

        /*
        Ayni simde ama farkli mehodlari olusturmak icindegistirebilecegimiz seyler
        1- parametre sayisi,
        2- ayni sayida parametreye sahip olsa bile parametrelerin data turlerini degistirebiliriz.
        3- ayni sayida ve ayni data turlerinde parametreleri olan methodlarda parametrelrin siralanisi.
         */

    }

}
