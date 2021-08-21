import java.util.Scanner;

public class equilibrium {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getEquiPosition(arr));


    }

    private static int getEquiPosition(int[] arr) {

        int pos = -1;


     for(int i=0;i<arr.length;i++){

         int sum1=0;
         int sum2=0;

         for(int j=0;j<i;j++){

             sum1 =sum1+arr[j];
         }

         for(int k=i+1;k<arr.length;k++){

             sum2 =sum2+arr[k];
         }

         if(sum1 == sum2){
             pos =i+1;
             break;
         }



     }

        return pos;
    }
}
