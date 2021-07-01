import java.util.*;


public class ranking{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];


        for(int l=0;l<n;l++){
            name[l]= sc.next();
            score[l]=sc.nextInt();

        }

      for(int i=0; i<name.length-1;i++ ){

          for(int j=0;j<name.length-i-1;j++){

              if(score[j]<score[j+1]){

              int temp = score[j];
              score[j]= score[j+1];
              score[j+1] = temp;

              String temp1 = name[j];
              name[j]= name[j+1];
              name[j+1]=temp1;

              }

             else if(score[j] == score[j+1] && name[j].compareTo(name[j+1])>0){

                  String temp1 =name[j];
                  name[j]= name[j+1];
                  name[j+1]=temp1;

              }

          }
      }

      String[] answer = new String[n];


      int rank=1;
      int count =1;
      for(int l=0;l<n+1;l++){



          System.out.println(rank +" "+ name[l]);
          count++;
          if(l == n-1){

              break;
          }

          if(score[l] != score[l+1]){

              rank= count;
          }



      }


    }}