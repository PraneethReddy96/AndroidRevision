import java.util.*;

public class noOfArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int length = n * m;
            long[] arr = new long[length];

            for (int j = 0; j < length; j++) {

                arr[j] = sc.nextLong();
            }

            long target = sc.nextLong();
            int high = arr.length - 1;
            int low = 0;

            System.out.println(helpTheWarrens(target, arr, high, low));
        }

    }

    public static boolean helpTheWarrens(long target, long[] arr, int high, int low) {

        boolean isPresent = false;


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                isPresent = true;
                break;
            }

            if (arr[mid] < target) {

                low = mid + 1;
            }

            if (arr[mid] > target) {

                high = mid - 1;
            }

        }

        return isPresent;
    }


}