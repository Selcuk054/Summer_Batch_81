package day15_overloadingForLoop;

public class C08_Factoriyel {
    public static void main(String[] args) {
        /*
        input olarak verilen bi rtam sayi icin faktoriyel hesaplayip yazdiran bir method olustutun.
        verilen sayi negatif veya 20 den buyuk olursa "girilen sayinin faktoriyeli hesaplanamaz"
        uyarisi yazdirin.
         */
        int input=18;
        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {
        int faktoriyel=1;
        if (input<0 || input>20){
            System.out.println("Verilen sayi icin faktoriyel hesaplanamaz");
        }else if (input==0){
            System.out.println("0!=1'dir");
        }else {
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel degeri :"+faktoriyel);
        }
    }
}
