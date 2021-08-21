import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class possible{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n==0 ){
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }else if (n>0){


           LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();


            for(int i=0;i<n;i++){

                int l = sc.nextInt();
                set.add(l);
            }


            int l =set.size();
            int arr[] = new int[l];


           Iterator itr = set.iterator();

           int h =0;
           while (itr.hasNext()) {

               arr[h] = (int) itr.next();
               h++;
           }

            for (int i = 0; i < arr.length-1; i++)
                for (int j = 0; j < arr.length-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {

                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }

       if(arr.length >2) {

           if (arr[0] < arr[1] && arr[1] < arr[2]) {

               System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
           } else if (arr[0] == arr[1] || arr[1] == arr[2]) {

               System.out.println("Not Possible");
           }

           if (arr[l - 3] < arr[l - 2] && arr[l - 2] < arr[l - 1]) {

               System.out.println(arr[l - 3] + " " + arr[l - 2] + " " + arr[l - 1]);
           } else if (arr[l - 3] == arr[l - 2] || arr[l - 2] == arr[l - 1]) {

               System.out.println("Not Possible");
           }

       }else if(arr.length <=2){
           System.out.println("Not Possible");
           System.out.println("Not Possible");

       }


        }

    }}