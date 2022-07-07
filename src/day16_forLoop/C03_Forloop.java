package day16_forLoop;

public class C03_Forloop {
    public static void main(String[] args) {
        // 10 ile 30 arasinda ki sayilari arasinda virgul kullanarak yazdirin.
        //10 30 dahil

       int bas=10;
       int son=30;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i+", ");
            }else {
                System.out.print(i);
            }

        }
    }
}
