package day25_constructor;

public class C02_Constructor {

    public static void main(String[] args) {

        C01 obj1=new C01();
        // C01 --> Class adi
        //obj1 --> objenin adi
        // = -->assignment
        //new --> keyword
        // C01() --> method? n(ee) --> Constructer (yapici)

        //Constructor Javanin obje olusturmak icin kullandigi kod blogudur.
        //burda isleyisi guzumuzle goremeyiz arka planda calisan kodlar.
        //Javada bir obje olustirabilmek icin mutlaka constructor kullanmalisiniz.

        System.out.println(obj1.sayi); //
        obj1.deneme();



        /*    OZET
        1- Constructor : Javanin obje olusturmak icin kullandigi kod blogudur. bir constructor
        calismadan obje olusmasi mumkun degildir.
        2- Bir class olusturdugumuzda ,Jav o class dan obje olusturulmasini saglamak icin her class a defau;t coonstructor koyar.
        Befault constructor gorunmez parametresi yoktur, constructor body sinde sxtra bir kod yok.
        3- Biz constructor dan spesifik ozelliklere sahip bir obje istiyorsak bunu parametre ile constructor a iletmemiz veya
        objeyi base ozelliklerde olusturup sonra istedigimiz degeleri atamamiz gerekir.
        4- Biz de istersek constructor olusturabiliriz, urettigimiz constructor ister parametreli isterse de default
        constructor gibi parametresiz olsun, java default constructor u siler.
        5-Her obje olusturuldugunda obje olusturula class daki temel atamalara sahip olur. Bir objenin herhangi bir
        ozelliginin degerini bulmak istedigimizde Java su siralamaya bakar
            1- obje olusturulduktan sonra deger atanmismi
            2- eger deger atanmamissa obje olusan class a gidip o variable atanmis bir biger varmi?
            3- O da yoksa data turune gore java nin belirledigi default degeri alir.
         6- Constructor ismi class ismi ile ayni olmalidir. Constructor isminden sonra normal parantez ve varsa parametreler sonrada {}
         constructor body olmalidir, class leveldadir.


         */
    }
}
