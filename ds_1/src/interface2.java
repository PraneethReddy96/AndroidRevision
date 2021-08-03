public interface interface2 {


     static void getName(String s){

         System.out.println(s);

    }


    default void getAddress(String s){

        System.out.println(s);

    }

    void getAge(int Age);

}
