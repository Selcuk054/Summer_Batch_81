package day22_multiDimentionalsArrays;

public class C03_mDAIstenenSayilariYazdirma {
    /*
    Verilen iki katli multi-dimensional array da outer indexi ve inner indexi ayni olan sayilarin toplamini bulunuz.
    int [][] sayilar={{1,5,6,9},{2,5,5,8},{3,1,6}};
    [0][0] + [1][1] + [2][2] .....
     */
    public static void main(String[] args) {

        int [][] sayilar={{1,5,6,9},{2,5,5,8},{3,1,6},{1,1,1,1,1}};

        int istenenToplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length; j++) {

                if (i==j){
                    istenenToplam+=sayilar[i][j];
                }



            }

        }
        System.out.println("istenen Toplam :"+istenenToplam);//12

    }
}
