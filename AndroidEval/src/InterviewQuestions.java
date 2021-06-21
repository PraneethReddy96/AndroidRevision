public class InterviewQuestions {



    /*

    1) A hashtable consits of both key and values.
    Whenever we use put() method to put key and value,
    ex: map.put(k,V)
    It uses hashcode method , which gets(calculates) the particular hashcode of the key object and by applying
    hashing on that hashcode, it associates  the bucket location for storing the value object.

    And thus a value is stored using put() method.








    2) A static variable belongs to the scope of the class where as non static variables scope depends on the access
    modifier  with which they are instantiated.
    - Static variables and methods  are instantiated before all the other methods and variables in the class and their
     value remains same throughout the class.
     -non static variables are instantiated and used based upon the necessity and their scope is based on the type
      (global variable/member variable)

      ex:

      consider two methods getValue() and getValue2()

      public static int  value1=0;

     void getValue(){
      int value2 =0;

    System.out.print( value2++);

    }

    void getValue2(){
    System.out.print( value1++);
    }


Here whenever getValue is called the answer would be 1. As we are initializing the value of the variable with 0 again
 and again, which is a local variable.

 Where as whenever getValue2 is called the output would increase by 1 i.e..  1 2 3 4 5 ... no of times function is called.


Thus in this way a static and non static variable can be defined.



     */




}
