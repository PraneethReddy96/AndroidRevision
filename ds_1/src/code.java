import java.util.*;

public class code {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String s = sc.next();

            System.out.println(getStringCode(m, s));
        }
    }

    private static String getStringCode(int m, String s) {

        String ans = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {

            if (map.containsKey(s.charAt(i))) {

                int n = map.get(s.charAt(i));
                map.put(s.charAt(i), n+1);
            } else map.put(s.charAt(i), 1);

        }

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Character, Integer> entrySet = iterator.next();

            ans = ans + entrySet.getKey() + "" + entrySet.getValue();


        }


        return ans;
    }


}
