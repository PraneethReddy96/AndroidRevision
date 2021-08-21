import java.util.Scanner;

public class happy {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();


        for(int i=0;i<test;i++){

            long target = sc.nextLong();

            System.out.println(isHappy(target));

        }


    }

    private static boolean isHappy(long target) {


        long sum=0;

        if(target > 1 && target <10 ){

            return false;
        }
        else if(target == 1){

            return true;
        }


        while(target > 0){

           long rem = target % 10;
            sum = sum+ rem*rem;
            target = target / 10;

        }

       return isHappy(sum);


    }


}
