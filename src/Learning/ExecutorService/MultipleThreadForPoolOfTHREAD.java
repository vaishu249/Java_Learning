package Learning.ExecutorService;

public class MultipleThreadForPoolOfTHREAD implements Runnable {
    public char ch;
    public MultipleThreadForPoolOfTHREAD(char ch) {
        this.ch=ch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d %c",i ,ch);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
