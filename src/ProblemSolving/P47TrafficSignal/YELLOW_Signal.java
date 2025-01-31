package ProblemSolving.P47TrafficSignal;

public class YELLOW_Signal extends Thread{
    String color;
    YELLOW_Signal(String color){
        this.color=color;
    }

    @Override
    public synchronized void run() {
        System.out.println(color);
    }
}
