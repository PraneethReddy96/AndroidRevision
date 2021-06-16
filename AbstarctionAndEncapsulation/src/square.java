public class square extends Shape{

   int side;

    public square(int side){

        this.side=side;

    }

    @Override
    void calculateArea() {
        System.out.println("The area os the sqaure is: "+(side*side)+"sqcm");

    }
}
