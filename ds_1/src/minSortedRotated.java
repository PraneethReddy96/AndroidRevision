import java.util.*;

public class minSortedRotated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new  int[n];


        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        int high = arr.length-1;
        int low = 0;

        System.out.println(getLow(high,low,arr));

    }

   public static int getLow(int high,int low,int[] arr) {
        int ans =0;

       while(low <=high){

           int mid = low + (high-low)/2;

           if(arr[mid] > arr[high]){

               low =mid+1;


           }

          else if(arr[mid] < arr[high]){
               high = mid;

           }
           else if(arr[mid] == arr[high]) {
               high--;

           }
       }


       return arr[low];
   }


}
