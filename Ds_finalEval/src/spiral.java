import java.util.*;


public class spiral{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int test= sc.nextInt();

        for(int h=0;h< test;h++) {

            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            int size = n * n;
            int count = 0;
            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = n - 1;

            while (count < size) {

                for (int i = left; i <= bottom && count < size; i++) {

                    System.out.print(arr[i][top] + " ");
                    count++;

                }

                top++;

                for (int i = top; i <= right && count < size; i++) {

                    System.out.print(arr[bottom][i] + " ");
                    count++;
                }

                bottom--;

                for (int i = bottom; i >= left && count < size; i--) {

                    System.out.print(arr[i][right] + " ");
                    count++;
                }
                right--;


                for (int i = right; i >= top && count < size; i--) {

                    System.out.print(arr[left][i] + " ");
                    count++;
                }
                left++;

            }

            System.out.println();

        }
    }}


