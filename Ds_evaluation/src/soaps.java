import java.util.*;
public class soaps {


    public static void main(String[] args) {


   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();

   int[] arr  = new int[n];

   for (int i=0;i<n;i++){

       arr[i] = sc.nextInt();

   }

   Arrays.sort(arr);

   int Q = sc.nextInt();

   for(int i=0;i<Q;i++){

       int target = sc.nextInt();

       int high =arr.length-1;
       int low=0;
       int answer = search(high,low,target,arr);

//      if(answer == -1){
//          System.out.println(arr.length);
//
//      }else
          System.out.println(answer);

   }


    }

    private static int search(int high, int low, int target, int[] arr) {

        int ans =-1;

      while(low <= high){

          int mid = low + (high-low)/2;

//          if(arr[mid] == target){
//
//              ans = mid;
//              break;
//
//          }
            if(arr[mid] < target){

                low = mid+1;

                ans = low;
          }

           if(arr[mid] > target){

              high = mid-1;
          }

      }

      return ans;
    }


}

/*

5
1 4 10 5 6
4
2
3
5
11
 */