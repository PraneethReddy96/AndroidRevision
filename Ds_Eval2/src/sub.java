import java.util.*;

public class sub{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int high =arr.length-1;
        int low =0;

        int answer = getElement(arr,high, low,target);

        if(answer == -1){
            System.out.println("-1");
        }
        else {
            for(int i=0;i<n;i++){
                if(arr[i] == answer){
                    System.out.println(i);
                    break;
                }

            }
        }


    }

    public static int getElement(int[] arr,int high,int low,int target){

        int ans=-1;

        Arrays.sort(arr);

        while(low<=high){

            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }

            if(arr[mid] > target){

                high = mid-1;
            }
            else if(arr[mid] < target){

                low = mid+1;
            }

        }


        return ans;
    }

}