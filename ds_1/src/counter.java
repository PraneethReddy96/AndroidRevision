import java.util.*;


public class counter{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jump=0;
        System.out.println(count(n,jump));


    }


    public static int count(int n,int jump){


        if(n == jump){

            return 1;
        }


        if(n < jump){

            return 0;
        }



        return     count(n,jump+1) + count(n,jump+2)+ count(n,jump+3);





    }

}