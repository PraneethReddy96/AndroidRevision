import java.util.Arrays;
import java.util.Scanner;

public class life {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {

            int type =sc.nextInt();
            int value =sc.nextInt();
            int high=arr.length-1;
            int low=0;
            int num1=0;
            int num2=0;


          switch (type){
              case 0:
                  num1= lowerBound(value,arr,high,low);
                  num2= upperBound(value,arr,high,low);
                  calculateQuerryZero(type,arr,num1,num2);
                  break;
              case 1:
                   num1= upperBound(value,arr,high,low);
                  calculateQuerryOne(arr,num1);
                  break;
            }

        }
    }

    private static void calculateQuerryZero(int type, int[] arr, int num1, int num2) {

        if(num1 !=-1 && num2 !=-1){

            int num = num2-num1;
            System.out.println((arr.length-num2) + num);

        }

       else if(num1 ==-1 && num2 ==-1) {
            System.out.println(0);

        }


    }

    private static void calculateQuerryOne( int[] arr, int num) {

        if( num !=-1){

            System.out.println(arr.length-num);
        }else if(num ==-1) {
            System.out.println(0);

        }

    }

    private static int lowerBound( int value, int[] arr, int high, int low){
        int answer =-1;
        int max =arr[high];

        if(value >max){

            return -1;

        }else {
            while (low <= high) {

                int mid = low + (high - low) / 2;


                if (arr[mid] < value) {

                    low = mid + 1;


                }
                if (arr[mid] >= value) {
 answer=mid;
                    high = mid - 1;


                }


            }
        }
        return answer;
    }


    private static int upperBound( int value, int[] arr, int high, int low) {

       int answer = -1;
       int max=arr[high];
        if(value >max){

            return -1;

        }else {

        while (low<=high) {

            int mid = low + (high - low) / 2;


            if (arr[mid] <= value) {

                low = mid + 1;
                answer = low;
            }
            if (arr[mid] > value) {

                high = mid - 1;
            }

        }
        }
        return answer;
    }
}
