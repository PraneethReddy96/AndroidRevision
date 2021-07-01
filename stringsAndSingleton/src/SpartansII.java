import java.util.HashMap;
import java.util.Iterator;

final class SpartansII {


     private final String name ;

     private final int rollNo ;

     private final HashMap<String,String> testMap;




     public int getRollNo() {
           return rollNo;
      }


      public String getName() {
           return name;
      }

      public HashMap<String, String> getTestMap() {
           //return testMap;
           return (HashMap<String, String>) testMap.clone();
      }

      public SpartansII(int i, String n, HashMap<String,String> hm){
           System.out.println("Performing Deep Copy for Object initialization");
           this.rollNo=i;
           this.name=n;
           HashMap<String,String> tempMap=new HashMap<String,String>();
           String key;
           Iterator<String> it = hm.keySet().iterator();
           while(it.hasNext()){
                key=it.next();
                tempMap.put(key, hm.get(key));
           }
           this.testMap=tempMap;
      }



      public static void main(String[] args) {
           HashMap<String, String> h1 = new HashMap<String,String>();
           h1.put("1", "first");
           h1.put("2", "second");

           String s = "Praneeth";

           int i=53;

           SpartansII ce = new SpartansII(i,s,h1);


           System.out.println(s==ce.getName());
           System.out.println(h1 == ce.getTestMap());
           System.out.println("rollNo:"+ce.getRollNo());
           System.out.println(" name:"+ce.getName());
           System.out.println("testMap:"+ce.getTestMap());

           i=20;
           s="modified";
           h1.put("3", "third");

           System.out.println(" rollNo after local variable change:"+ce.getRollNo());
           System.out.println(" name after local variable change:"+ce.getName());
           System.out.println(" testMap after local variable change:"+ce.getTestMap());

           HashMap<String, String> hmTest = ce.getTestMap();
           hmTest.put("4", "new");

           System.out.println(" testMap after changing variable from accessor methods:"+ce.getTestMap());

      }

 }





