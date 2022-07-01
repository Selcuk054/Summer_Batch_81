package day13_methodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
     /*
String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
Stringini " Java ogrenmek cok guzel." şekline getirin
 */
     String str= " Java ogrenmek123 Cok guzel@ ";

     str=str.trim();
     str=str.replaceAll("\\d","");
     str=str.replace("@","");
     str=str.replace("C","c");
     str=str+".";

     System.out.println(str);

    }
}
