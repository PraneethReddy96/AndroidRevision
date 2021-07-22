public class praneeth extends name implements kalpesh {

    praneeth(){
//
//        var++;
//        System.out.println(var);
    }
    static int var = 1;
    public static void main(String[] args) {

       praneeth name = new praneeth();
       praneeth name1 = new praneeth();
       praneeth name2 = new praneeth();
        int[] arr = new int[5];
        try{
            System.out.println(arr[5]);

        }catch (IndexOutOfBoundsException e){

            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);

        }

    }





    public int add(int a, int b){



      return a+b;
    }

    public int add(double a, int b){



        return (int)a+b;
    }



    @Override
    public void getState(String name) {

    }


    @Override
    public void name(int name) {

    }


    @Override
    public void hello(int name) {

    }

    @Override
    public void getName(String name) {

    }
}
