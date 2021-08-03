import java.util.Scanner;
import java.util.*;

public class main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr={4,5,8,1,2};


        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        for(int i=0;i<arr.length-1;i++){

            boolean swap = false;
        for(int j=0;j<arr.length-i-1;j++) {

            if (arr[j+1] > arr[j]) {

                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;

                swap = true;
            }
        }

            if(!swap){

                break;
            }

        }


    }

}

/*

     2 6 4 5 7
i--> 0 1 2 3 4
length -> 5

j<= length-i-1;
4
3
2
1
0

2 6 4 5 7

2 4 6 5 7

2 4 5 6 7

2 4 5 6 7

2 4 5 6 7




  if(n <0){
  print(false);
  }

   else{
  while (n%2 ==0 && n!=0){

  n= n/2;
  }

   if(n==1){
   return true;
   }
   else
   return false;
 }












 */