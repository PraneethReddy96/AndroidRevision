public class array {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        int size = arr.length;
        for(int i=0; i<arr.length-1;i++){

            arr[i]= arr[i+1];

        }

        size--;

        for(int i =0;i<size;i++) {
            System.out.println(arr[i]);

        }

        System.out.println("-----------------------------------------------------------------------------------------");

        int[] arr1 = {1,2,3,4,5};

        for(int i=0;i<arr1.length;i++){



            if(i!=3){
               arr1[i]= arr1[i];
            }

        }

        for(int i =0;i<arr1.length;i++) {
            System.out.println(arr1[i]);

        }




    }


}
