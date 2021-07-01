import java.util.*;


public class party {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        Queue<Integer> queue = new  LinkedList();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            int m = sc.nextInt();

            switch (m) {

                case 1:
                    queue.add(sc.nextInt());
                    break;
                case 2:
                    stack.push(sc.nextInt());
                    break;
                case 3:
                    if(!queue.isEmpty()) {
                        System.out.println(queue.peek());
                    }
                    else System.out.println("-1");
                    break;
                case 4:
                    if(!stack.empty()) {
                        System.out.println(stack.peek());
                    }
                    else
                        System.out.println("-1");
                    break;
                case 5:
                    stack.push(queue.poll());
                    break;

            }


        }


    }
}