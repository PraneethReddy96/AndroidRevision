import java.util.*;

public class binary {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k =sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i]= sc.nextInt();
        }

        int low =0;
        int high = arr.length-1;


        System.out.println(search(low,high,arr,k));

    }

    private static int search(int low, int high, int[] arr, int k) {



        if(low > high){

            return -1;

        }



            int mid = low + (high-low)/2;

            if(arr[mid] <k){

                low = mid+1;
            }else if(arr[mid] > k){

                high = mid-1;
            }

            if(arr[mid] == k){

               return 1 ;

            }

        return search(low,high,arr,k);
    }


}
