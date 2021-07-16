import java.util.*;


public class lowerBound{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int low=0;
        int high=n-1;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print(lowerBound(high,low,m,arr));

    }

    public static int lowerBound(int high, int low,int target, int[] arr){


        int answer=0;

        while(low<= high){

            int mid= low + (high-low)/2;

            if(arr[mid] == target){
                Stack<Integer> list = new Stack<>();
                answer = getMid(mid,arr,target,list);
                break;

            }

            if(arr[mid] > target){

                high = mid-1;
            } else if(arr[mid] < target){

                low = mid+1;
            }
        }

        if(low>high){
            answer= -1;
        }
        return answer;
    }

    private static int getMid(int mid, int[] arr,int target,Stack<Integer> list) {



        if(mid ==0 && arr[mid]==target){

            return 0;

        }
        if(arr[mid] != target){

            return list.pop();
        }

        if(arr[mid] == target){
            list.push(mid);
        }

        return getMid(mid-1,arr,target,list);

    }

}