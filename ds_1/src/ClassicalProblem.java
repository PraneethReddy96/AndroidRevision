import java.util.*;

public class ClassicalProblem{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n =sc.nextInt();

        for(int l=0;l<n;l++){

            String s= sc.next();

            ArrayList<Character> bin = new ArrayList<>();
            Stack<Character> stk1 = new Stack<Character>();

            for(int i=0;i<s.length();i++){

                switch (s.charAt(i)){

                    case '{':
                        stk1.push(s.charAt(i));
                        break;
                    case '[':
                        stk1.push(s.charAt(i));
                        break;
                    case '(':
                        stk1.push(s.charAt(i));
                        break;
                    case '}':
                        if(!stk1.empty() && stk1.peek() =='{'){
                            stk1.pop();
                        }else bin.add('}');
                             break;
                    case ']':
                        if(!stk1.empty() && stk1.peek() =='['){
                            stk1.pop();
                        }else bin.add(']');
                        break;

                    case ')':
                        if(!stk1.empty() && stk1.peek() =='('){
                            stk1.pop();
                        } else bin.add(')');
                        break;

                }



            }

            if(stk1.empty() && bin.size()==0){
                System.out.println("balanced");
            }else if(!stk1.empty() && bin.size()>0){
                System.out.println("not balanced");
            }

        }




    }}