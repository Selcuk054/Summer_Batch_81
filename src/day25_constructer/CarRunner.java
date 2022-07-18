package day25_constructer;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 Bilgileri\nMarka :"+ car1.marka +"\nModel :"+ car1.model+
                "\nYil :"+car1.yil+ "\nFiyat :"+ car1.fiyat);


        Car car2=new Car();

        System.out.println("Car2 Bilgileri\nMarka :"+ car2.marka +"\nModel :"+ car2.model+
                "\nYil :"+car2.yil+ "\nFiyat :"+ car2.fiyat);

        /*
        Herhangi bir obje uzerinden variable yazdirmaya calistigimizda Java degeri su siralama ile arar.
        1- O obje olusturulduktan sonra bir deger atandi mi ?
        2- Objenin olusturuldugu class da vrarable a bir deger  atanmis mi bakar
        3- `Ozaman data durune gore Jav adefault degeri atar.
         */
    }

}
