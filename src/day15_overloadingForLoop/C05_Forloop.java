package day15_overloadingForLoop;

public class C05_Forloop {
    public static void main(String[] args) {

        //1 den 5 e (dahil) kadar olan tam sayilari toplayalim.

        int toplam=0;


        for (int i = 1; i <=5 ; i++) {
            toplam +=i;

        }
        System.out.println("toplam = " + toplam);
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam 10-20 arasi = " + toplam);
        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("30 -50 arasi ciftler toplami"+ toplam);

        //2. yontem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
            System.out.println("30-50 arasi ciftler toplami :"+toplam);

        }


    }


