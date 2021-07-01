//Enter code here


import java.util.*;


public class sum{

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int r = sc.nextInt();
        int l =1;
        double total=1;
        double value = sum(n,r,l,total);
         System.out.format("%.4f", value);

    }


    public static double sum(int n , int r, int l,double total){

        if(r ==0){
            return total;

        }
        if(n==l){

            total = total + 1/Math.pow(r,l);

            return total;
        }

        total = total + 1/Math.pow(r,l);

        return sum(n,r,l+1,total);


    }


}


