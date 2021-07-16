import java.util.Scanner;

public class upperBound {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){

          arr[i] =sc.nextInt();

        }

        int high = arr.length-1;
        int low=0;


        System.out.println(upperBound(high,low,target,arr));



    }



    public static int upperBound(int high, int low,int target, int[] arr){


        int answer=-1;

        while(low<= high){

            int mid= low + (high-low)/2;

            if(arr[mid] == target){

                answer = mid+1;
                low = mid+1;

            }

            if(arr[mid] > target){

                high = mid-1;
            }
            else if(arr[mid] < target){

                low = mid+1;
                answer =low;
            }
        }


        return answer;
    }



}
