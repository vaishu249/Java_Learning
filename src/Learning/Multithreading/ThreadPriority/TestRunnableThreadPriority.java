package Learning.Multithreading.ThreadPriority;

import Learning.Multithreading.ImplementingRunnableInterface.PrintTaskThreadPriority;

public class TestRunnableThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        PrintTaskThreadPriority p1=new PrintTaskThreadPriority('*');
        PrintTaskThreadPriority p2=new PrintTaskThreadPriority('#');
        PrintTaskThreadPriority p3=new PrintTaskThreadPriority('$');
        PrintTaskThreadPriority p4=new PrintTaskThreadPriority('&');
        Thread t1=new Thread(p1);
        t1.start();
        t1.join();
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2=new Thread(p2);
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        new Thread(p3).start();
        new Thread(p3).setPriority(Thread.NORM_PRIORITY);
        new Thread(p4).start();

    }
}
