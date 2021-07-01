import java.util.*;

public class sub{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s= sc.next();
        int index=0;
        printSub(n,index,s);

    }


    public  static void printSub(int n,int index, String s){

        String sub = "";


        if(index == n-1){

            sub=sub+s.charAt(n-1);
            System.out.println(sub);
            return;
        }


        for(int i=index;i<n;i++){


            sub= sub+s.charAt(i);

            System.out.println(sub);

        }
        printSub( n,index+1, s);


    }

}