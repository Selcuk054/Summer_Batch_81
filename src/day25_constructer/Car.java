package day25_constructer;

public class Car {
    /*
    Bir araba olusturmak icin variable ve methodlari
    bu klass da belirleriz saonra\ farkli
    class larda araba olusturmamiz gerekirse
    u class dan bir obje olusturup burada belirlenen
    variable ve methodlara gore araba uretiriz.
     */
    String marka="Marka belirtilmadi";
    String model="Model belirilmedi";
    int yil;
    int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");

    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba maximum "+ hiz+ "km hiz yapar");
    }
}
