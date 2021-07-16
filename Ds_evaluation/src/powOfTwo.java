import java.util.*;


public class powOfTwo{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i=0;i<test;i++){

            long n= sc.nextLong();
            if(n <=0){


                if(powerOfNegTwo(n)){
                    System.out.println("True");
                }
                else if(!powerOfNegTwo(n)){
                    System.out.println("False");
                }

            }else if (n >=0){


                if(powerOfTwo(n)){
                    System.out.println("True");
                }
                else if(!powerOfTwo(n)){
                    System.out.println("False");
                }

            }
        }
    }

    public static boolean powerOfTwo(long n){

        boolean isPresent = false;
        if(n ==0){

            isPresent =false;
        }

        while (n > 0){

            if(n%2 ==1){
                isPresent=true;
               n= n/2;
            }

        }

      return isPresent;
    }


    public static boolean powerOfNegTwo(long n){


        boolean isPresent = false;
        if(n ==0){

            isPresent =false;
        }

        while (n < 0){

            if(n % 2 ==-1){
                isPresent=true;
                n= n/2;
            }

        }

        return isPresent;
    }



}
