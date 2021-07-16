import java.util.Scanner;

public class bugs {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }
        int high=arr.length-1;
        int low =0;

       int answer =  upperBound(arr,high,low)-lowerBound( arr, high, low) +1;
        if(answer ==n){

            System.out.println("-1");

        }else System.out.println(answer);
    }

    public static int lowerBound(int[] arr, int high,int low){
        int ans =0;

        while (low<=high){

            int mid = low+ high-low/2;

            if(arr[mid] == 0){

                high = mid-1;
                ans = mid;

            }


            if(arr[mid] < 0){

                low = mid+1;
            }

           else if(arr[mid] > 0){

               high = mid-1;
            }


        }

        return ans;
    }

    public static int upperBound(int[] arr,int high,int low){
        int ans =0;


        while (low<=high){

            int mid = low+ high-low/2;

            if(arr[mid] == 0){

                low = mid+1;
                ans = mid;

            }


            if(arr[mid] < 0){

                low = mid+1;
            }

            else if(arr[mid] > 0){

                high = mid-1;
            }


        }


        return ans;
    }

}
