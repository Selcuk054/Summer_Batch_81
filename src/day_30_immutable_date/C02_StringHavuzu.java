package day_30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false

        System.out.println("S1-S4"+str1.equals(str4));//true

        System.out.println("S1-S4"+(str1==str4));//true

        /*
        1- Yeni bir String olustururken esitligin saginda new keyword u olursa java direk yeni bir obje ve ref olusturur

        2- Eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa String immutable oldugundan degisikligi
        kaydetmek uzere hemen bir kopya String ve referansi olusturur, sonra degeri hesaplayip bu yeni kopya objeun icine koyar.
         */

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5));//true
        System.out.println(str5==str1);//true

        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true

        System.out.println(str5.equals(str6));//true
        System.out.println(str5.equals(str6));//true

        /*
        Eger yeni string objesi olusturulurken new kelimesi kullanilmaz veya esitligin ysaginda bir + islemi olmazsa
        Java bakar.

        Eger daha once olusturulan String objelerden birebir ayni string varsa o objeyi ve referansini kullanir.
        bire bir aynisi yoksa yeni bir obje ve ref olusturur.

        STRING HAVUZU


         */
    }
}
