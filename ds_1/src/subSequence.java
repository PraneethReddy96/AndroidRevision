import java.io.*;
import java.lang.*;
import java.util.*;

class subSequence{
    static List<String> list = new ArrayList<>(); //global list stores all non empty subsequences of the string


    //Main Function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        findsubsequences(s, "");
        System.out.println(list);
    }
    //This function finds out all the subsequences of the given string.
    public static void findsubsequences(String s,String ans){
        if (s.length() == 0) {
            if (!ans.isEmpty()) list.add(ans);
            return;
        }
        findsubsequences(s.substring(1), ans + s.charAt(0));
        findsubsequences(s.substring(1), ans);
    }
}