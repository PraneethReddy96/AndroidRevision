import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hahmap {

    public static void main(String[] args) {


        HashMap<String,Integer> map = new HashMap<>();


        map.put("nani",100);
        map.put("reddy",90);
        map.put("ron",80);
        map.put("juve",70);
        map.put("praneeth2",60);
        map.put("praneeth",70);

        System.out.println(map);

        System.out.println();


        Iterator<Map.Entry<String ,Integer>> iterator1 = map.entrySet().iterator();


        while(iterator1.hasNext()) {

            Map.Entry<String, Integer> entry = iterator1.next();


            if (entry.getKey().length() < 5) {

                System.out.println(entry.getKey()+" "+entry.getValue());
            }


        }

        Iterator<String > iterator = map.keySet().iterator();


        while(iterator.hasNext()){

            String iterate = iterator.next();

            if(iterate.length() >= 6){

               iterator.remove();

            }

        }
        System.out.println(map);

    }

}
