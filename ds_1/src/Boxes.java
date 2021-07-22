import java.util.*;


public class Boxes {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prob = sc.next();
        int m = sc.nextInt();
        String check = sc.next();

        if (checkSubString(check, prob, " ")) {

            System.out.print("Yes");
        } else System.out.print("No");


    }

    public static boolean checkSubString(String check, String prob, String ans) {

        boolean isPresent = false;
        if (prob.length() == 0) {

            if (!ans.isEmpty() && check.equals(ans)) {

                isPresent = true;

            }
            return isPresent;
        }

        checkSubString(check, prob.substring(1), ans + prob.charAt(0));
        checkSubString(check, prob.substring(1), ans);

        return isPresent;
    }


}
