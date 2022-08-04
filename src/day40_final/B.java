package day40_final;

final public class B extends A{

    public static void main(String[] args) {
        B obj=new B();
        obj.isim="Alp";
       // obj.okul="Java koleji"
        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        ir class final olarak belirlenirse o class inherit edilemez.
         */



    }
}
