import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {


    public static void main(String[] args) {


        Set<String> set = new HashSet<>();


        set.add("India");
        set.add("Pak");
        set.add("China");
        set.add("Aus");
        set.add("Japan");
        set.add("Pak");
        set.add("India");


        System.out.println(set);

        Iterator<String> iterator = set.iterator();

        for (String temp : set) {
           if(temp.length() >3){
               System.out.println(temp);
           }
        }

        set.remove("India");

        System.out.println(set);

    }
}
