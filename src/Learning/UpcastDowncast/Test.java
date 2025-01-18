package Learning.UpcastDowncast;

public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        Vehicle v=new Vehicle();
        Vehicle v2=new Car();
        v2.start();
        c.carStar();
        v.start();
    }
}
