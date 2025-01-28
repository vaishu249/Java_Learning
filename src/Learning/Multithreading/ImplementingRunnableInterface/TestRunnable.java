package Learning.Multithreading.ImplementingRunnableInterface;

public class TestRunnable {
    public static void main(String[] args) {
        PrintTaskThreadPriority p1=new PrintTaskThreadPriority('*');
        PrintTaskThreadPriority p2=new PrintTaskThreadPriority('#');
        PrintTaskThreadPriority p3=new PrintTaskThreadPriority('$');
        PrintTaskThreadPriority p4=new PrintTaskThreadPriority('&');
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();

    }
}
