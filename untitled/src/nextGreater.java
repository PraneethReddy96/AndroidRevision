import java.util.Stack;

public class nextGreater {

    public static void main(String[] args) {


        int[] arr = {1,2,4,3,7,6};
        int[] arr1= new int[arr.length];

        Stack<Integer> stack = new Stack<>();



        for(int i=arr.length-1;i>=0;i--){

            while(!stack.empty() && stack.peek() < arr[i]){

                stack.pop();
            }
            if(stack.empty()){

              arr1[i]= -1;
            }
            else arr1[i] =stack.peek();

            stack.push(arr[i]);
        }

      for(int i=0;i<arr1.length;i++){
          System.out.print(arr1[i]+" ");
      }
    }
}
