import java.util.*;
public class multiply {


    public static void  main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int product=0;

        if((n<0 && m<0) || (n>0 && m>0)){


            if(n<0 && m<0){
                n = -n;
                m= -m;
            }

            for(int i=1;i<=m;i++){

             product= product+n;

            }
            System.out.println(product);

        }else {

            for(int i=1;i<=m;i++){

                product= product+(-n);

            }

            System.out.println(-product);
        }


    }

}
