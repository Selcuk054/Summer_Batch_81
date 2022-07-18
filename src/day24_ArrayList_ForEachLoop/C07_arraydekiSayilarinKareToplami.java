package day24_ArrayList_ForEachLoop;

public class C07_arraydekiSayilarinKareToplami {
   /* Soru 2:
    Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin
    toplamini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
    */
   public static void main(String[] args) {


    int[] sayilar= {2,3,4,1,5,7,6,5,4,3};

    int toplam=0;
       for (int each: sayilar
            ) {
           toplam+=each*each;
       }
       System.out.println("kareler toplami : " +toplam);


}
}