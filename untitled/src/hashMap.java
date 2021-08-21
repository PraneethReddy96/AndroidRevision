import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class hashMap{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        HashMap<Integer, Integer> map = new HashMap<>();



        for(int i=0;i<n;i++){

            int m = sc.nextInt();

            if(map.containsKey(m)){

                int count = map.get(m);
                map.put(m,count+1);

            }else
                map.put(m,1);


        }


        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){

            Map.Entry<Integer,Integer> entry1 = iterator.next();

            if(entry1.getKey() ==0 && entry1.getValue() == n){

                System.out.println("-1");
            }
            else {
                System.out.println(map.get(0));
                break;
            }
        }
    }}

