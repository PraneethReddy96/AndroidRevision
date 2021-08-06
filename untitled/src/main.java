import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String k = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            if (c != ' ') {
                if (map.containsKey(c)) {

                    int count = 1;
                    map.put(c, map.get(c) + count);
                } else map.put(c, 1);
            }

        }
        for (int i = 0; i < k.length(); i++) {

            char l = k.charAt(i);

            if (l != ' ') {
                if (map2.containsKey(l)) {

                    int count = 1;
                    map2.put(l, map2.get(l) + count);
                } else map2.put(l, 1);
            }


        }

        if(map.equals(map2)){
            System.out.println("Anagram");
        }else System.out.println("Not Anagram");

    }
}
