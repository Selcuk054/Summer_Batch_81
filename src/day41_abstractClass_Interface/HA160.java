package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

      /*
        Abstract parent silsilesinden gelen ilk concrete class parent i olan tum class lardaki abstract methodlari
       concrete hale donusturmek yani override etmek zorundadir.

       Bu kuralin istisnasi parent classlardan herhangi birinde concrete hale donusturulmus abstract methodlardir.


        */

    public static void main(String[] args) {
        HA160 arb1=new HA160();
        // Concrete bir class dan istedigimiz objeyi uretebiliriz.

        FMercedes arb2=new FMercedes();
        //mercedes de concrete

        //EToyota arb3=new EToyota();

        EToyota arb4 =new GCorolla();
        // Abstract classlar constructor barindirir amaobje uretemezler
        //Toyota class i abstract class oldugundan obje uretilemez

       /*


        List<String> list1 =new List<String>();
        List<String> list2 =new ArrayList<>();

        Abstract bir class in ozelliklerini tasiyan bir obje olusturmak istedigimizde Data turunu
        istedigimiz abstract class constructor i ise child i olan concrete bir class dan seceriz.

        */



    }

}
