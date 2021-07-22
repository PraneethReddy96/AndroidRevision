import java.util.*;

public class possible{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int count=0;

        for(int i=0;i<arr.length && count<=1;i++){

            if(arr[i] <= target && count <= 1){
                stack.push(arr[i]);
            }
            if(arr[i] > target){
                count++;
            }

        }

        System.out.print(stack.size());


    }}