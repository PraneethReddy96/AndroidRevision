import java.util.*;


public class nearestGreater{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int test= sc.nextInt();

        for(int i=0;i<test;i++){

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int j=0;j<arr.length;j++){

                arr[j]= sc.nextInt(); }

            int[] ans = nextGreaterElement(arr);

            for(int j=0;j<ans.length;j++){

                System.out.print(ans[j]+" ");

            }
            System.out.println();
        }

    }

    public static int[] nextGreaterElement(int[] arr){

        int n= arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){

                stack.pop();

            }
            if(stack.isEmpty()){

                ans[i] =-1;}
            else {
                ans[i] =stack.peek();}

            stack.push(arr[i]);

        }

        return ans;
    }



}