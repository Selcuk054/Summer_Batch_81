package day32_stringBuilder;

public class C06_Replace {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Calm Down");

        sb.replace(5,10,"Up");
        System.out.println(sb); //Calm Up

        sb.replace(4,5,"----");
        System.out.println(sb);

        sb.replace(4,8," ");
        System.out.println(sb);//Calm Up

        sb.replace(5,7,"Down");
        System.out.println(sb); //Calm Down


    }

}
