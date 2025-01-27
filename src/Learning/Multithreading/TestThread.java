package Learning.Multithreading;

public class TestThread {
    public static void main(String[] args) {
        First o1=new First();
        Second o2=new Second();
        Third o3=new Third();
        System.out.println("Thread t1 starting ");
        o1.start();
        System.out.println("Thread t2 starting ");
        o2.start();
        System.out.println("Thread t3 starting ");
        o3.start();
        System.out.println("End of code ");
    }
}
