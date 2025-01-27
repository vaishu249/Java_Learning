package Learning.Multithreading.ImplementingRunnableInterface;

public class TestRunnable {
    public static void main(String[] args) {
        PrintTask p1=new PrintTask('*');
        PrintTask p2=new PrintTask('#');
        PrintTask p3=new PrintTask('$');
        PrintTask p4=new PrintTask('&');
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();

    }
}
