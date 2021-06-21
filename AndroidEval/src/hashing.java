import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashing {

    public static void main(String[] args) {



        HashMap<String, String> map = new HashMap<>();

         map.put("Praneeth","8790623742");
         map.put("Praneeth7","8790623744");
         map.put("Praneeth8","8790623745");
         map.put("abc","8790623782");
         map.put("xyz","8790623792");



        Iterator<Map.Entry<String, String>>iterator = map.entrySet().iterator();
        Iterator<Map.Entry<String, String>>iterator2 = map.entrySet().iterator();


try {
    while (iterator.hasNext()) {

        Map.Entry<String, String> entryMap = iterator.next();

        if (entryMap.getKey().length() > 5) {
            System.out.println(entryMap.getKey() + " " + entryMap.getValue());

        }


    }
}
catch (Exception e){}


        System.out.println();
        try {
            while (iterator2.hasNext()) {

                Map.Entry<String, String> entryMap = iterator2.next();

                if (entryMap.getKey().length() >= 6) {

                    map.remove(entryMap.getKey());
                }
                System.out.println(entryMap.getKey() + " " + entryMap.getValue());

            }

        } catch (Exception e){}




    }





}
