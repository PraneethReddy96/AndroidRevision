
import java.util.*;


public class arrayList {

    public static void main(String[] args) {



        ArrayList<String> list = new ArrayList<>();

        list.add("praneeth");
        list.add("xyz");
        list.add("abc");
        list.add("praneeth12");
        list.add("praneeth45");

        for(int i=0;i<list.size();i++) {

            if(list.get(i).length() >5 ) {
                System.out.println(list.get(i));
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        list.remove(2);

        for(int i=0;i<list.size();i++) {


                System.out.println(list.get(i));

        }

        System.out.println("-----------------------------------------------------------------------------------------------" +

                "-----------------------------------------------------------------------------------------------------");


        list.add(3,"masai");

        for(int i=0;i<list.size();i++) {


            System.out.println(list.get(i));

        }


    }


}
/*Create an ArrayList of 5 String elements and perform the following operations
Print all the array elements
Print the array elements whose length is greater than 5
Remove the element at index 2 and print the remaining elements
Change the element at index 3 to "Masai" and print the array List.*/



