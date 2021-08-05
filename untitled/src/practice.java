public class practice {

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
        int[] arr2= new int[arr1.length-1];

        for(int i=0;i<arr2.length;i++){



            arr2[i]= arr1[i];

        }

        for(int i =0;i<arr2.length;i++) {
            System.out.println(arr2[i]);

        }

        System.out.println("-----------------------------------------------------------------------------------------");


        int[] arr3 = new int[arr1.length-1];

        for(int i=0;i<arr3.length;i++){


            if (i==3){
                arr3[i]= arr1[i+1];
                break;
            }
            arr3[i] =arr1[i];

        }


        for(int i =0;i<arr3.length;i++) {
            System.out.println(arr3[i]);

        }






    }


}
