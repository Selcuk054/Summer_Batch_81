package day18_while_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {
      /*
      while loop ta once kontrol edip islm yaptigimiz icin islem bitiikten sonra loop un
      kirilmasi icin bir kez daha basa donmemiz gerekiyor
       */
        int sayi = 7;


        while (sayi < 10){
            System.out.println(sayi);
        sayi++;


        }

        /*
        do-while loop ile calistigimizda bu dezavantaj ortadan kalkar
         */
        sayi=7;

         do{
            System.out.println(sayi);      //7

             sayi++;                   //8
        }while (sayi<10);

        }

    }
