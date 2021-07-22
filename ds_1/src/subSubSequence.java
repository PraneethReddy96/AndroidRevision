import java.util.*;
import java.lang.*;

public class subSubSequence{
    public static List<String>  list= new ArrayList<>();
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        findSubSequence(s,"");


        for(int i=0;i<list.size()-1;i++){

            for(int j=0;j<list.size()-i-1;j++){

                if(list.get(j).compareTo(list.get(j+1)) >= 0 ){

                    String temp = list.get(j);
                    list.set(j,list.get(j+1)) ;
                    list.set(j+1,temp);

                }

            }

        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void findSubSequence(String s,String temp){

        if(s.length() == 0){

            if(!temp.isEmpty()){
                list.add(temp);
            }
            return;
        }
        findSubSequence(s.substring(1), temp+s.charAt(0));
        findSubSequence(s.substring(1) , temp);
    }
}

 /*
 a
ab
abc
abcd
abd
ac
acd
ad
b
bc
bcd
bd
c
cd
d
a
ab
abc
abcd
abd
ac
acd
ad
b
bc
bcd
bd
c
cd
d








*/