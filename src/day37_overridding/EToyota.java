package day37_overridding;

     public class EToyota extends DAraba{

         @Override
         void marka() {
            /* super.marka();
            Eger hem overridden hemde overridding methodun calismasini istersek ilk
            satira super.marka() yazabiliriz
             */
             System.out.println("markamiz Toyota");
         }

         void motor(){
               System.out.println("Toyota araclar Toyota marka kullanir");
}
}
