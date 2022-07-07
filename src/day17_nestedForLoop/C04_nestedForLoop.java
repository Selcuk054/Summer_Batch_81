package day17_nestedForLoop;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa gore yildizlardan olusan bir ucgen olusturun
        ornek input=4 ise
        *
        * *
        * * *
        * * * *
         */
        int input=10;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}
