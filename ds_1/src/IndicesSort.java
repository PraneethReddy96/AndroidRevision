import java.util.*;
public class IndicesSort {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        int[] answer = new int[n];

        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
            answer[i] = i;
        }


        for(int i=0;i<n-1;i++){

            int min =i;
            int min2 =i;
            for(int j=i+1;j<n;j++){

           if(arr[min] > arr[j]){

               min=j;

           } }


            int temp = arr[min];
            arr[min] =arr[i];
            arr[i] =temp;

            int temp2 =answer[min];
            answer[min] = answer[i];
            answer[i]=temp2;

        }



        for (int i=0;i<arr.length;i++){

            System.out.print(answer[i]+" ");
        }


    }


}
