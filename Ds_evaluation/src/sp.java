import java.util.Scanner;

public class sp {


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        int test = sc.nextInt();

        for(int i=0;i<test;i++) {
            int n = sc.nextInt();
            System.out.println(sp(n));
        }
    }
    private static int sp(int n) {
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return sp(n-4)+sp(n-8);
    }
}


