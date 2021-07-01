import java.util.*;

public class ticket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<n;i++){

         char x = sc.next().charAt(0);

         switch (x){

             case 'E':
                 queue.add(sc.nextInt());
                 if(!queue.isEmpty()) {
                     System.out.println(queue.size());
                 }
                 else System.out.println("-1");
                 break;
             case 'D':
                 if(!queue.isEmpty()) {
                     System.out.println(queue.poll()+" "+queue.size());

                 }else System.out.println("-1"+" "+queue.size());
                  break;


         }



        }



    }


}
