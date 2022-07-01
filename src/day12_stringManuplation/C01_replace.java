package day12_stringManuplation;

public class C01_replace {
    public static void main(String[] args) {
        String str= " Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

        //Hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        // guz el yerine harika yazalim


        //Cumleyi replace kullanarak Bugun Java cok guzel yapalim

        str=str.replace(" Bu gun","bugun")
                .replace("ha va","Java").replace("guz el","guzel");
    }
}
