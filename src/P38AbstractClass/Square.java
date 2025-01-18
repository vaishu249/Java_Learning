package P38AbstractClass;

public class Square extends Shape{
    public int length;
    public int breadth;
    Square(int l,int b){
        this.length=l;
        this.breadth=b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle is : "+2+(length*breadth));
    }
}
