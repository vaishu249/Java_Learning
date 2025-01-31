package ProblemSolving.P46ThreadJoin;

public class TestThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Threadone t1=new Threadone(1);
        Threadone t2=new Threadone(2);
        Threadone t3=new Threadone(3);
        Threadone t4=new Threadone(4);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t4.start();
    }
}
