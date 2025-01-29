package P45Thread;

public class TestThread {
    public static void main(String[] args) {
        ThreadOne t=new ThreadOne(1);
        ThreadOne t2=new ThreadOne(2);
        t.start();
        t2.start();
    }
}
