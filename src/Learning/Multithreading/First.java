package Learning.Multithreading;

public class First extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+"*  ");
        }
        System.out.println();
    }
}
