//import java.util.List;
//import java.util.*;
//public class lists {
//
//
//
//            ruleKey == "type" and ruleValue == typei.
//            ruleKey == "color" and ruleValue == colori.
//            ruleKey == "name" and ruleValue == namei.
//
//
//    public static void main(String[] args) {
//
//
//      ArrayList<items> items = new ArrayList<>();
//
//      items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
//        ruleKey = "type", ruleValue = "phone"
//
//
//
//
//
//        System.out.println(countMatches(items) );
//
//    }
//
//
//
//        public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//
//            int count = 0;
//
//            for(List<String> list : items) {
//                if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) count++;
//                else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) count++;
//                else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) count++;
//            }
//            return count;
//
//
//        }
//
//
//
//}
