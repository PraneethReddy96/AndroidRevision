public class pattern {

    public static void main(String[] args) {


   for(int count=0;count<2;count++) {
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j <= i; j++) {

               System.out.print("*");

           }
           System.out.println();
       }

       for (int i = 3; i >= 0; i--) {
           for (int j = i; j >= 0; j--) {
               System.out.print("*");
           }

           System.out.println();
       }

   } }
}
