import java.util.*;

public class nextGreater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int l = 0; l < n; l++) {

            int m = sc.nextInt();

            int[] arr = new int[m];

            for (int i = 0; i < arr.length; i++) {

                arr[i] = sc.nextInt();

            }

            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print("-1");
                    break;
                }

                boolean isPresent = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        isPresent = true;
                        System.out.print(arr[j] + " ");
                        break;
                    }


                }
                if (!isPresent) {
                    System.out.print("-1" + " ");

                }
            }

            System.out.println();
        }

    }
}