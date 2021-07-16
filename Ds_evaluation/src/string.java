import java.util.*;

public class string{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();


        String[] arr = s.split(" ");

        int l = arr.length;

        int[] arr2 = new int[l];

        int sum=0;
        for(int i =0;i< arr2.length;i++){
            arr2[i] = Integer.parseInt(arr[i]);
            sum=sum+arr2[i];
        }

        Arrays.sort(arr2);

        int max = arr2[arr2.length-1];

        int sol = max*(max+1)/2 - sum;

        System.out.println(sol);

    }}