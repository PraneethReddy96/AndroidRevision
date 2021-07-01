
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int l=0;l<n;l++){


            int row= sc.nextInt();
            int column= sc.nextInt();
            int[][] arr= new int[row][column];

            for(int i=0; i<row;i++ ){
                for(int j=0; j<column;j++ ){

                    arr[i][j]=sc.nextInt();
                }}

            int count=0;
            int Right=0;
            int left=0;
            int row1 =row;
            int Bottom = row - 1;
            int end = column-1 ;
            int top=0;
            int column1= column;

            while (arr.length>0) {


                for (int i = Right; i <= Right; i++) {

                    if(count == row*column){
                        break;
                    }

                    for (int j = Right; j < row1; j++) {
                        count++;
                        System.out.print(arr[j][i] + " ");
                        if(count == row*column){
                            break;
                        }

                    }
                    if(count == row*column){
                        break;
                    }
                }


                Right++;
                row1--;



                for (int i = Bottom; i <= Bottom; i++) {

                    if(count == row*column){
                        break;
                    }

                    for (int j = Right; j < column1; j++) {
                        count++;
                        System.out.print(arr[i][j] + " ");
                        if(count == row*column){
                            break;
                        }

                    }
                    if(count == row*column){
                        break;
                    }
                }
                Bottom--;
                column1--;



                for (int i = end; i <= end; i++) {

                    if(count == row*column){
                        break;
                    }

                    for (int j = Bottom; j >= top; j--) {
                        count++;
                        System.out.print(arr[j][i] + " ");
                        if(count == row*column){
                            break;
                        }

                    }
                    if(count == row*column){
                        break;
                    }

                }
                end--;
                top++;



                for (int i = left; i <= left; i++) {

                    if(count == row*column){
                        break;
                    }

                    for (int j = end; j >= Right; j--) {
                        count++;
                        System.out.print(arr[i][j] + " ");
                        if(count == row*column){
                            break;
                        }

                    }

                }
                left++;

                if(count == row*column){
                    break;
                }

            }
            System.out.println();
        }


    }

}
