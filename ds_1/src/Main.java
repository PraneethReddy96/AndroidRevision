import java.util.*;

public class Main{

    public static void main(String[] ags){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){

            arr[i]= sc.nextInt();

        }

        System.out.print(getDistinct(arr));



    }

    public static int getDistinct(int[] arr) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else
                map.put(arr[i], 1);
        }
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();



         while (iterator.hasNext()){
             Map.Entry<Integer, Integer> entry = iterator.next();
             sum = sum+entry.getKey();

         }




        return sum;
    }
    }