
import  java.util.*;
public class milk {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i=0;i<test;i++) {

            int n = sc.nextInt();

            int answer = 0;
            int sol = 0;
            System.out.println(noOfWays(n, answer, sol));
        }

    }

    private static int noOfWays(int n,int answer,int sol) {

        if(answer == n){

           return 1;
        }
        if(answer > n){

            return 0;
        }
        if(answer < n){
          sol=  ( noOfWays(n, answer + 4, sol)) + (noOfWays(n, answer + 8, sol));

        }

        return sol;
    }

}
