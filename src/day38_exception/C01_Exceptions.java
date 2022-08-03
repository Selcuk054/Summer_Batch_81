package day38_exception;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
          Bir sorunla karsilasmayi beklediginiz noktalarda if else ile sorunu yakalayip
          onunla ilgili cozum uretebilirsiniz ama sorunu her zaman if else ile cozemeyecegimizden
          Java try-catch block'lari olusturmustur.
         */
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {

            if (b == 0) {
                System.out.println("Islem yapilirken payda 0 oldu dikkat etmellisiniz");
            } else {
                System.out.println(a / b);

            }
            b--;
            sayac++;
        }

    }

}