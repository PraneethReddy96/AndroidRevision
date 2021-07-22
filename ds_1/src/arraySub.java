import java.io.*;
import java.util.*;

class GFG{

    // Recursive function to print all
// possible subsequences for given array
    public static void printSubsequences(int[] arr, int index,
                                         ArrayList<Integer> path)
    {

        // Print the subsequence when reach
        // the leaf of recursion tree
        if (index == arr.length)
        {

            // Condition to avoid printing
            // empty subsequence
            if (path.size() > 0)
                System.out.println(path);
        }

        else
        {

            // Subsequence without including
            // the element at current index
            printSubsequences(arr, index + 1, path);

            path.add(arr[index]);

            // Subsequence including the element
            // at current index
            printSubsequences(arr, index + 1, path);

            // Backtrack to remove the recently
            // inserted element
            path.remove(path.size() - 1);
        }
        return;
    }

    // Driver code
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // Auxillary space to store each path
        ArrayList<Integer> path = new ArrayList<>();

        printSubsequences(arr, 0, path);
    }
}