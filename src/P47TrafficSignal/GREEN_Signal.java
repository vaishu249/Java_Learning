package P47TrafficSignal;

public class GREEN_Signal extends Thread{
    String color;
    GREEN_Signal(String color){
        this.color=color;
    }

    @Override
    public synchronized void run() {
        System.out.println(color);
    }
}
