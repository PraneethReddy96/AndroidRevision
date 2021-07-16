import java.util.*;

public class binarySearch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Q= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);


        for(int i=0;i<Q;i++){

            int k =sc.nextInt();
            int low =0;
            int high = arr.length-1;

            search(low,high,arr,k);
        }

    }

    private static void search(int low, int high, int[] arr, int k) {

        while (low <= high){

            int mid = low + (high-low)/2;

            if(arr[mid] < k){

                low = mid+1;
            }else if(arr[mid] > k){

                high = mid-1;
            }

            if(arr[mid] == k){

                System.out.println("YES");
                break;
            }

        }

        if(low > high){

            System.out.println("NO");

        }

    }


}
