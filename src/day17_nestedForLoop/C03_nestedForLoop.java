package day17_nestedForLoop;

public class C03_nestedForLoop {
    public static void main(String[] args) {
        //verilen yukseklik ve boy degerine gore yildizlardan olusan bir dikdortgen olurturalim.
        //yukseklik :3   boy: 4
       // * * * *
      //  * * * *
      //  * * * *
        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
