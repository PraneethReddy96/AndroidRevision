public class test implements interface1,interface2 {

    public static void main(String[] args) {


        test t = new test();

        interface2 obj = new test();


        interface2.getName("hello");

    }


    @Override
    public void getAddress(String s) {

    }

    @Override
    public void getAge(int Age) {

    }
}
