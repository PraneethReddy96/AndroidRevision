import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String k = sc.next();
        boolean isAnagram = false;

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


            Iterator<Map.Entry<Character, Integer>> entryIterator = map.entrySet().iterator();
            Iterator<Map.Entry<Character, Integer>> entryIterator1 = map2.entrySet().iterator();


            while (entryIterator.hasNext() && map.size() == map2.size()) {

                Map.Entry<Character, Integer> iterator = entryIterator.next();
                Map.Entry<Character, Integer> iterator1 = entryIterator1.next();


                if (iterator.getValue() == iterator1.getValue()) {

                    isAnagram = true;

                } else
                    isAnagram = false;
                break;
            }
        }
        System.out.println(map);
        System.out.println(map2);
            if (isAnagram) {
                System.out.println("Anagram");
            } else if (map.size() != map2.size() || !isAnagram)
                System.out.println("Not Anagram");



    }
}
