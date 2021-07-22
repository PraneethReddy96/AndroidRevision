import java.util.*;

public class salesMan{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();


        for(int i=0;i<test;i++){

            int n =sc.nextInt();
            int rupees = sc.nextInt();
            Stack<Integer> stack = new Stack<>();

            stack.push(sc.nextInt());

            for(int k=1;k<n;k++){

                int var=sc.nextInt();

                if(stack.peek() < var ){

                    stack.push(var); }

            }


            System.out.println(stack.size()*rupees);
        }


    }}