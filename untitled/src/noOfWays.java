import java.util.Scanner;

public class noOfWays{

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int ways=0;
        System.out.print(noOfways(n,ways));
    }

    public static int noOfways(int n,int ways){

        if(ways == n){
            return 1;
        }

        if(ways > n){
            return  0;
        }


        else return noOfways(n,ways+1) + noOfways(n,ways+2) + noOfways(n,ways+3);


    }

}