public class palindrome {


    public static void main(String[] args) {


        String q = "maam";
       boolean present =false;
        int left=0;
        int right= q.length()-1;
       while (left <= right){

           if(q.charAt(left) == q.charAt(right)){

               left++;
               right--;
               present=true;
           }else {
               present= false;
               break;
           }
       }

       if(present){
           System.out.println("palindrome");
       }else {
           System.out.println("not palindrome");
       }


    }

}
