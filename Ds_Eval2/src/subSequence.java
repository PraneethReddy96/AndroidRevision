import java.util.*;

public class subSequence {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        int test = sc.nextInt();

        for(int i=0;i<test;i++){

            int m = sc.nextInt();

            int[] arr = new int[m];



            for(int j=0;j<arr.length;j++){

                arr[j] = sc.nextInt();
            }

            int high = m-1;
            int low =0;

            System.out.println(sub(m,arr,high,low));

        }



    }

    private static String sub(int m, int[] arr, int high, int low) {

        String answer = "No";
        Arrays.sort(arr);

        int target = arr[m-1];


        while (low<high){

            if(arr[low] + arr[high] == target){
                answer="Yes";
                break;

            }

            if(arr[low]+ arr[high]> target){

                high--;

            }
            if(arr[low]+ arr[high]< target){

                low++;

            }



        }




        return answer;
    }


}
