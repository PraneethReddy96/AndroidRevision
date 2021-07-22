import java.util.*;
public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        int high = arr.length - 1;
        int low = 0;

        if(isInSorted(arr, high, low) || arr.length == 1){
            System.out.println("YES");
        }else System.out.println("NO");

    }

    private static boolean isInSorted(long[] arr, long high, long low) {

        boolean isSorted= false;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (arr[(int) mid]  > arr[(int) high]) {

                low = mid+1;
            }

            if (arr[(int) mid] < arr[(int) high]) {

                high = mid;

            }else
                high--;


        }

        long pivot = arr[(int) low];
        long temp=0;
        long below=0;

        if(pivot == arr[0]) {
            for (long i = 0; i < arr.length - 1; i++) {

                if (arr[(int) i] > arr[(int) (i + 1)]) {

                    isSorted = false;
                    break;

                }else
                    isSorted = true;

            }
        }
        if(!isSorted){

            for(long i=0;i<arr.length-1;i++){

                if (arr[(int) i] > arr[(int) (i + 1)]) {

                    temp =i;
                    below=i-1;
                    break;

                }
            }


            for(long i =temp;i<arr.length-1;i++){

                if(arr[(int) (i+1)]<arr[(int) i] && arr[arr.length-1] > arr[(int) below]){

                    isSorted =true;

                }
                else {
                    isSorted =false;
                    break;
                }

            }

        }
        return isSorted;
    }

}
