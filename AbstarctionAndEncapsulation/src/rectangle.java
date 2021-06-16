public class rectangle extends Shape{

    int length;
    int breadth;

    public rectangle(int length, int breadth){
      this.length =length;
      this.breadth = breadth;

    }

    @Override
    void calculateArea() {
        System.out.println("The area os the rectangle is: "+(length*breadth)+"sqcm");
    }
}
