import java.util.*;



public class etoX{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        double sum=1;
        int power=1;
        System.out.format("%.4f",expo(x,n,power,sum));

    }


    public static double expo(int x, int n,int power,double sum){

        int factSum=1;

        sum = sum +  Math.pow(x,power) * 1/fact(power,factSum) ;


        if(n==power){


            return sum;

        }


        return expo(x,n,power+1,sum);

    }


    public static int fact(int n, int factSum){

        if(n ==0){

            return factSum;
        }

        factSum= factSum*n;

        return fact(n-1,factSum);
    }
}