package ProblemSolving.P47TrafficSignal;

public class RED_Signal extends Thread{
    String color;
    RED_Signal(String color){
        this.color=color;
    }

    @Override
    public synchronized void run() {
        System.out.println(color);
    }
}
