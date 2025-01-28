package Learning.Multithreading.ImplementingRunnableInterface;

public class PrintTaskThreadPriority implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d %c",i,ch);
        }
        System.out.println();
        System.out.printf("Task 1 Complete as %c",ch);

    }
    public final char ch;
    public PrintTaskThreadPriority(char ch){
        this.ch=ch;
    }
}
