import java.util.*;

public class oddSubSet {

    public static void main(String[] args) {


        Scanner  sc = new Scanner(System.in);

       int n = sc.nextInt();

       int[] arr = new int[n];

       for(int i=0;i<n;i++){

        arr[i] = sc.nextInt();

       }

        System.out.println(getCount(arr,n));



    }

    private static int getCount(int[] arr, int n) {

        int count =0;
        int sum=0;


        int[] odd = new int[n+1];



        for(int i=1;i<=n;i++) {

            if( arr[i-1] %2 != 0){

                count =odd[i-1] + odd[i-1]+1;

            }

        }

return count;

        }






    }



