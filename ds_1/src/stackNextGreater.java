import java.util.*;


public class stackNextGreater{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();



        for(int i=0; i< test; i++){

            int n = sc.nextInt();

            int[] arr = new int[n];


            for(int j=0; j <n; j++){
                arr[j] = sc.nextInt();
            }

            int[] arr1 = getGreaterElement(arr,n);



            for(int j=0; j <arr1.length; j++){
                System.out.print(arr1[j]+" ");
            }
        }


    }

    public static int[] getGreaterElement(int[] arr,int n){

        int[] arr1 = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){

            while(!stack.empty() && stack.peek() <= arr[i]) {

                stack.pop();
            }

            if(stack.empty()){
                    arr1[i] = -1;
                }
            else{
                arr1[i]= stack.peek();

            }

            stack.push(arr[i]);

            }




        return arr1;
    }


}